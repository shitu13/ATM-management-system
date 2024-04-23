package bank.management.system;


import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;



public class SignUpOne extends JFrame{

     SignUpOne(){
        setLayout(null);

        Random random = new Random();
        long first4 = (random.nextLong() % 9000L) + 1000L;
        String first = ""+ Math.abs(first4);

        JLabel formno = new JLabel("Application Form no. "+first);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Personal Details: Page 1");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        JTextField nameTextField = new JTextField(15);
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);


        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        JTextField fnameTextField = new JTextField(15);
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        JDateChooser datechooser = new JDateChooser();
        datechooser.setBounds(300, 240, 200, 30);
        add(datechooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        JTextField emailTextField = new JTextField(15);
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        JTextField addressTextField = new JTextField(15);
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        JTextField cityTextField = new JTextField(15);
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        JTextField stateTextField = new JTextField(15);
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        JTextField pinTextField = new JTextField(15);
        pinTextField.setBounds(300,590,400,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);
     }
}
