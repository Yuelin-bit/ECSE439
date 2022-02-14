package ca.mcgill.emf.examples.hal.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.controller.HalController;
import ca.mcgill.emf.examples.hal.dto.TODevice;
import ca.mcgill.emf.examples.hal.dto.TORoom;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JButton btnShow;
	private JButton btnDelete;
	private JButton btnClear;
	private JTextField roomTextField;
	private JComboBox<String> roomList;
	
	//error
	private JLabel errorLabel = new JLabel();
	private String error = null;
	private JLabel lblRoom;
	private JTextField deviceTextField;
	private JTable sensorTable;
	private JScrollPane scrollPaneSensor;
	
	//table
	private DefaultTableModel sensorDtm;
	private String sensorColumnNames[] = {"Sensor"};
	private DefaultTableModel actuatorDtm;
	private String actuatorColumnNames[] = {"Actuator"};
	private static final int HEIGHT_TEAMS_TABLE = 100;

	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnAddDevice;
	private JTable actuatorTable;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnRemove;
	private JRadioButton rdbtnSensor;
	private JRadioButton rdbtnActuator;
	private JComboBox sensorCombo;
	private JComboBox actuatorCombo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void refreshUI(String roomInput) {
		errorLabel.setText(error);
		String currentRoomName = roomInput;
		TORoom toRoom = null;
		if(currentRoomName != null) {
			toRoom = HalController.getRoom(currentRoomName);
		}
		roomList.removeAllItems();
		int index = 0, foundIndex = -1;
		for(String name : HalController.getRooms()) {
			roomList.addItem(name);
			if(name.equals(toRoom == null ? null : toRoom.getName())) {
				foundIndex = index;
			}	
			index ++;	
		}
		roomList.setEnabled(index > 0);
		roomList.setSelectedIndex(foundIndex);
		btnShow.setEnabled(index > 0);
		btnDelete.setEnabled(index > 0);
		
		if(foundIndex == -1) {
			toRoom = null;
			lblRoom.setText("");
			roomTextField.setText("");
			
			populateDeviceTable(null);
			deviceTextField.setText("");
			
			btnClear.setEnabled(false);
			btnAdd.setEnabled(true);
			btnUpdate.setEnabled(false);
			deviceTextField.setEnabled(false);
			btnAddDevice.setEnabled(false);
		} else {
			lblRoom.setText(toRoom.getName());
			roomTextField.setText(toRoom.getName());
			
			populateDeviceTable(toRoom);
			deviceTextField.setText("");
			
			btnClear.setEnabled(true);
			btnAdd.setEnabled(false);
			btnUpdate.setEnabled(true);
			deviceTextField.setEnabled(true);
			btnAddDevice.setEnabled(true);
			
		}
		Dimension d = sensorTable.getPreferredSize();
		scrollPaneSensor.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
		error = null;
	}
	
	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("Hal system");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshUI( (String) roomList.getSelectedItem());
			}
		});
		btnShow.setBounds(223, 24, 80, 30);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(315, 24, 80, 30);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(roomList.getSelectedIndex() != -1) {
					String roomName = (String) roomList.getSelectedItem();
					int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room " + roomName + "?", 
			        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (choice == 0) { 
						HalController.deleteRoom(roomName);
						refreshUI(null);
					}
				}
			}
		});
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = null;
				refreshUI(null);
			}
		});
		btnClear.setBounds(407, 24, 80, 30);
		
		roomList = new JComboBox();
		roomList.setBounds(61, 24, 150, 30);
		
		JLabel lblRoomName = new JLabel("Room Name: ");
		lblRoomName.setBounds(16, 83, 90, 20);
		
		lblRoom = new JLabel("");
		lblRoom.setBounds(118, 83, 102, 20);
		contentPane.setLayout(null);
		contentPane.add(btnShow);
		contentPane.add(btnDelete);
		contentPane.add(btnClear);
		contentPane.add(roomList);
		contentPane.add(lblRoomName);
		contentPane.add(lblRoom);
		
		JLabel line1Label = new JLabel("--------------------------------------------------------------");
		line1Label.setForeground(Color.LIGHT_GRAY);
		line1Label.setBounds(6, 55, 498, 16);
		contentPane.add(line1Label);
		
		JLabel lblNewLabel = new JLabel("New Room Name:");
		lblNewLabel.setBounds(16, 115, 125, 20);
		contentPane.add(lblNewLabel);
		
		roomTextField = new JTextField();
		roomTextField.setBounds(162, 112, 130, 30);
		contentPane.add(roomTextField);
		roomTextField.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = HalController.addRoom(roomTextField.getText());
				refreshUI(roomTextField.getText());
			}
		});
		btnAdd.setBounds(293, 112, 80, 30);
		contentPane.add(btnAdd);
		
		JLabel lblNewLabel_1 = new JLabel("Table below");
		lblNewLabel_1.setBounds(16, 147, 428, 16);
		contentPane.add(lblNewLabel_1);
		
		scrollPaneSensor = new JScrollPane(sensorTable);
		scrollPaneSensor.setBounds(16, 175, 238, 120);
		contentPane.add(scrollPaneSensor);
		
		sensorTable = new JTable();
		scrollPaneSensor.setViewportView(sensorTable);
		
		deviceTextField = new JTextField();
		deviceTextField.setBounds(113, 333, 198, 26);
		contentPane.add(deviceTextField);
		deviceTextField.setColumns(10);
		
		btnAddDevice = new JButton("Add on");
		btnAddDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = HalController.addDevice(roomTextField.getText(), deviceTextField.getText(), rdbtnSensor.isSelected());
				refreshUI(roomTextField.getText());
			}
		});
		btnAddDevice.setBounds(315, 333, 102, 29);
		contentPane.add(btnAddDevice);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = HalController.updateRoomName(lblRoom.getText(),roomTextField.getText());
				refreshUI(roomTextField.getText());
			}
		});
		btnUpdate.setBounds(367, 112, 117, 29);
		contentPane.add(btnUpdate);
		
		JLabel lblDeviceName = new JLabel("Device name:");
		lblDeviceName.setBounds(16, 338, 102, 16);
		contentPane.add(lblDeviceName);
		
		errorLabel = new JLabel("");
		errorLabel.setForeground(Color.RED);
		errorLabel.setBounds(6, 6, 341, 16);
		contentPane.add(errorLabel);
		
		JScrollPane scrollPaneActuator = new JScrollPane();
		scrollPaneActuator.setBounds(266, 174, 248, 121);
		contentPane.add(scrollPaneActuator);
		
		actuatorTable = new JTable();
		scrollPaneActuator.setViewportView(actuatorTable);
		
		rdbtnSensor = new JRadioButton("Sensor");
		rdbtnSensor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sensorCombo.setEnabled(true);
				actuatorCombo.setEnabled(false);
			}
		});
		rdbtnSensor.setSelected(true);
		buttonGroup.add(rdbtnSensor);
		rdbtnSensor.setBounds(16, 307, 102, 23);
		contentPane.add(rdbtnSensor);
		
		rdbtnActuator = new JRadioButton("Actuator");
		rdbtnActuator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sensorCombo.setEnabled(false);
				actuatorCombo.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnActuator);
		rdbtnActuator.setBounds(266, 307, 93, 23);
		contentPane.add(rdbtnActuator);
		
		btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = null;
				if(actuatorTable.getSelectedRow() != -1) {
					name = (String) actuatorTable.getModel().getValueAt(actuatorTable.getSelectedRow(), 0);
				} else if(sensorTable.getSelectedRow() != -1) {
					name = (String) sensorTable.getModel().getValueAt(sensorTable.getSelectedRow(), 0);
				}
				if(name == null) return;
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete device " + name + "?", 
		        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (choice == 0) { 
					error = HalController.removeDevice(name);
					refreshUI(roomTextField.getText());
				}
				
			}
		});
		btnRemove.setBounds(421, 333, 93, 29);
		contentPane.add(btnRemove);
		
		sensorCombo = new JComboBox();
		sensorCombo.setBounds(97, 307, 157, 27);
		contentPane.add(sensorCombo);
		
		actuatorCombo = new JComboBox();
		actuatorCombo.setEnabled(false);
		actuatorCombo.setBounds(351, 307, 163, 27);
		contentPane.add(actuatorCombo);
		
		refreshUI(null);
	}
	
	private void populateDeviceTable(TORoom toRoom) {
		sensorDtm = new DefaultTableModel(0, 0);
		sensorDtm.setColumnIdentifiers(sensorColumnNames);
		sensorTable.setModel(sensorDtm);
		actuatorDtm = new DefaultTableModel(0, 0);
		actuatorDtm.setColumnIdentifiers(actuatorColumnNames);
		actuatorTable.setModel(actuatorDtm);
		if (toRoom != null) {
			for (TODevice device : toRoom.getDeviceList()) {
				Object[] obj = {device.getName()};
				if(device.getType().equals("sensor") || device.getType().equals("Sensor")) {
					sensorDtm.addRow(obj);
				} else {
					actuatorDtm.addRow(obj);
				}
			}
		}
	}
}
