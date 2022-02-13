package ca.mcgill.emf.examples.hal.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ca.mcgill.emf.examples.hal.controller.HalController;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JButton btnShow;
	private JButton btnDelete;
	private JButton btnClear;
	private JTextField roomTextField;
	private JTextField textField;

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
	
	private void refreshUI() {
		
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
		btnShow.setBounds(223, 24, 80, 30);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(315, 24, 80, 30);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(407, 24, 80, 30);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(61, 24, 150, 30);
		
		JLabel lblRoomName = new JLabel("Room Name: ");
		lblRoomName.setBounds(16, 83, 90, 20);
		
		JLabel lblRoom = new JLabel("Room1");
		lblRoom.setBounds(131, 83, 61, 20);
		contentPane.setLayout(null);
		contentPane.add(btnShow);
		contentPane.add(btnDelete);
		contentPane.add(btnClear);
		contentPane.add(comboBox);
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
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HalController.addRoom(roomTextField.getText());
				refreshUI();
			}
		});
		btnAdd.setBounds(293, 112, 80, 30);
		contentPane.add(btnAdd);
		
		JLabel lblNewLabel_1 = new JLabel("Table below");
		lblNewLabel_1.setBounds(16, 147, 428, 16);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 175, 471, 105);
		contentPane.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(116, 287, 198, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.setBounds(342, 287, 117, 29);
		contentPane.add(btnAdd_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(367, 112, 117, 29);
		contentPane.add(btnUpdate);
		
		JLabel lblDeviceName = new JLabel("Device name:");
		lblDeviceName.setBounds(16, 292, 102, 16);
		contentPane.add(lblDeviceName);
	}
}
