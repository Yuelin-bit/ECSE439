package ca.mcgill.emf.examples.hal.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ca.mcgill.emf.examples.hal.Room;
import ca.mcgill.emf.examples.hal.controller.HalController;
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
	private JTable deviceTable;
	private JScrollPane scrollPane;
	
	//table
	private DefaultTableModel deviceDtm;
	private String deviceColumnNames[] = {"Device"};
	private static final int HEIGHT_TEAMS_TABLE = 100;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnAddDevice;
	

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
		Dimension d = deviceTable.getPreferredSize();
		scrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
		error = null;
	}
	
	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("Hal system");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 353);
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
		
		lblRoom = new JLabel("Room1");
		lblRoom.setBounds(131, 83, 61, 20);
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
		
		scrollPane = new JScrollPane(deviceTable);
		scrollPane.setBounds(16, 175, 471, 105);
		contentPane.add(scrollPane);
		
		deviceTable = new JTable();
		scrollPane.setViewportView(deviceTable);
		
		deviceTextField = new JTextField();
		deviceTextField.setBounds(116, 287, 198, 26);
		contentPane.add(deviceTextField);
		deviceTextField.setColumns(10);
		
		btnAddDevice = new JButton("Add on");
		btnAddDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = HalController.addDevice(roomTextField.getText(), deviceTextField.getText(), "sensor");
				refreshUI(roomTextField.getText());
			}
		});
		btnAddDevice.setBounds(342, 287, 117, 29);
		contentPane.add(btnAddDevice);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(367, 112, 117, 29);
		contentPane.add(btnUpdate);
		
		JLabel lblDeviceName = new JLabel("Device name:");
		lblDeviceName.setBounds(16, 292, 102, 16);
		contentPane.add(lblDeviceName);
		
		errorLabel = new JLabel("");
		errorLabel.setForeground(Color.RED);
		errorLabel.setBounds(6, 6, 341, 16);
		contentPane.add(errorLabel);
	}
	
	private void populateDeviceTable(TORoom toRoom) {
		deviceDtm = new DefaultTableModel(0, 0);
		deviceDtm.setColumnIdentifiers(deviceColumnNames);
		deviceTable.setModel(deviceDtm);
		if (toRoom != null) {
			for (String deviceName : toRoom.getDeviceNames()) {
				Object[] obj = {deviceName};
				deviceDtm.addRow(obj);
			}
		}
	}
}
