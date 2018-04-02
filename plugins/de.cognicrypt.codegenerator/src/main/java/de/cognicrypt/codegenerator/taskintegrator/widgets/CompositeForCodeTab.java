package de.cognicrypt.codegenerator.taskintegrator.widgets;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.cognicrypt.codegenerator.question.Answer;
import de.cognicrypt.codegenerator.question.CodeDependency;

public class CompositeForCodeTab extends Composite {

	public CompositeForCodeTab(Composite parent, int style, Answer answer) {
		super(parent, style);
		
	    // Non-editable text box containing answer value
		Text txtBoxAnswers = new Text(this, SWT.BORDER);
		txtBoxAnswers.setBounds(5, 5, 210, 25);
		txtBoxAnswers.setEditable(false);
		txtBoxAnswers.setText(answer.getValue());

		//Code dependency text field
		Text txtValue = new Text(this, SWT.BORDER);
		txtValue.setBounds(220, 5, 200, 25);
		txtValue.setVisible(true);
		
		CodeDependency codeDependency = new CodeDependency();

		if (answer.getCodeDependencies() != null) {
			for (CodeDependency cd : answer.getCodeDependencies()) {
				if (cd.getValue() != null) {
					txtValue.setText(cd.getValue());
					codeDependency.setValue(txtValue.getText());
				}
			}
		}

		txtValue.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent e) {
				codeDependency.setValue(txtValue.getText());
			}
		});

		ArrayList<CodeDependency> codeDependencies = new ArrayList<CodeDependency>();
		codeDependencies.add(codeDependency);
		answer.setCodeDependencies(codeDependencies);


		
	}
	
	@Override
	protected void checkSubclass() {
		// To disable the check that prevents subclassing of SWT components
	}

}
