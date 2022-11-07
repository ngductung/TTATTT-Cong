package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.CongView;

public class CongController implements ActionListener {

	CongView view;

	public CongController(CongView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("refresh")) {
			view.refresh();
		} else if (command.equalsIgnoreCase("Tính")){
			view.setOutput();
		}

	}

}
