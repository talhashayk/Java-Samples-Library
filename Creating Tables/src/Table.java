import javax.swing.*;

public class Table extends JFrame {

	JTable table;

	String[] columnNames = { "Team", "Points", "Goal Difference" };
	String[][] teamStats = { { "Man Utd", "65", "40" }, { "Chelsea", "63", "38" }, { "Arsenel", "59", "36" },
			{ "Liverpool", "58", "35" } };

	public Table() {
		table = new JTable(teamStats, columnNames);
		table.setBounds(2, 2, 2, 20);
		JScrollPane scroll = new JScrollPane(table);
		this.add(scroll);
		this.setSize(300, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Table();
	}

}
