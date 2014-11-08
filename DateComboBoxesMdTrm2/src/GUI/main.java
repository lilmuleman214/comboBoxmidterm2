package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] months = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12"
		};
		
		JComboBox cmbMonth = new JComboBox(months);
		cmbMonth.setBounds(241, 70, 69, 30);
		cmbMonth.setSelectedItem("8");
		contentPane.add(cmbMonth);
		
		String[] days31 = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12",
		         "13",
		         "14",
		         "15",
		         "16",
		         "17",
		         "18",
		         "19",
		         "20",
		         "21",
		         "22",
		         "23",
		         "24",
		         "25",
		         "26",
		         "27",
		         "28",
		         "29",
		         "30",
		         "31"
		};
		
		String[] days28 = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12",
		         "13",
		         "14",
		         "15",
		         "16",
		         "17",
		         "18",
		         "19",
		         "20",
		         "21",
		         "22",
		         "23",
		         "24",
		         "25",
		         "26",
		         "27",
		         "28"
		};
		
		String[] days30 = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12",
		         "13",
		         "14",
		         "15",
		         "16",
		         "17",
		         "18",
		         "19",
		         "20",
		         "21",
		         "22",
		         "23",
		         "24",
		         "25",
		         "26",
		         "27",
		         "28",
		         "29",
		         "30"
		};
		
		/*JComboBox cmbDay; 
		if (cmbMonth.getSelectedItem() == "1" || cmbMonth.getSelectedItem() == "3" || cmbMonth.getSelectedItem() == "1" ||
				cmbMonth.getSelectedItem() == "5" || cmbMonth.getSelectedItem() == "7" || cmbMonth.getSelectedItem() == "8" ||
				cmbMonth.getSelectedItem() == "10" || cmbMonth.getSelectedItem() == "12")
			cmbDay = new JComboBox(days31);
		else if (cmbMonth.getSelectedItem() == "4" || cmbMonth.getSelectedItem() == "6" || cmbMonth.getSelectedItem() == "9" || cmbMonth.getSelectedItem() == "11")
			cmbDay = new JComboBox(days30);
		else
			cmbDay = new JComboBox(days28);*/
		
		JComboBox cmbDay = new JComboBox(days31);
		cmbDay.setBounds(241, 111, 69, 30);
		cmbDay.setSelectedItem("11");
		contentPane.add(cmbDay);
		
		String[] yrs = { "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};
		
		JComboBox cmbYear = new JComboBox(yrs);
		cmbYear.setBounds(241, 152, 69, 30);
		cmbYear.setSelectedItem("2014");
		contentPane.add(cmbYear);
		
		JLabel lblNewLabel = new JLabel("Month:");
		lblNewLabel.setBounds(157, 78, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setBounds(157, 119, 46, 14);
		contentPane.add(lblDay);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setBounds(157, 160, 46, 14);
		contentPane.add(lblYear);
	}
}
