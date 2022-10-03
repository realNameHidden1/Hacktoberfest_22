import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



 class RegistrationForm extends JFrame implements ActionListener{

    JLabel AppName;
    JLabel title;
    JTextField nameT;
    JLabel name;
    JPasswordField pass;
    JLabel pass1;
    JTextField email;
    JLabel email1;
    JTextField nameT2;
    JLabel name2;
    JTextField gender;
    JLabel gender1;
    JTextField city;
    JLabel city1;
    JTextField country;
    JLabel country1;
    JTextField phone;
    JLabel phone1;
    JButton sumbit;
    JButton clear;
    JCheckBox checkBox;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup group;


    RegistrationForm(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,500,860);
        panel.setBackground(new Color(0x00ff4d));
        panel.setLayout(null);
        this.add(panel);

        AppName.setFont(new Font("Comic Sans", Font.BOLD, 45));
        AppName.setForeground(Color.BLUE);
        AppName.setBounds(140, 100, 250, 50);

        title = new JLabel("Registration");
        title.setFont(new Font("Comic Sans", Font.BOLD, 35));
        title.setForeground(Color.BLUE);
        title.setBounds(150, 150, 200, 50);

        name = new JLabel("Name:");
        name.setBounds(120, 270, 50, 35);

        nameT = new JTextField();
        nameT.setBounds(180, 270, 150, 30);

        pass1 = new JLabel("Password:");
        pass1.setBounds(100, 320, 100, 35);

        pass = new JPasswordField();
        pass.setBounds(180, 320, 150, 30);

        email1 = new JLabel("Email:");
        email1.setBounds(120, 370, 50, 35);

        email = new JTextField();
        
        email.setBounds(180, 370, 150, 30);

        gender1 = new JLabel("Gender:");
        gender1.setBounds(110, 420, 50, 35);


        city1 = new JLabel("City:");
        city1.setBounds(130, 470, 50, 35);

        city = new JTextField();
        city.setBounds(180, 470, 150, 30);

        country1 = new JLabel("Country:");
        country1.setBounds(110, 520, 50, 35);

        country = new JTextField();
        country.setBounds(180, 520, 150, 30);

        phone1 = new JLabel("Phone No:");
        phone1.setBounds(100, 570, 90, 35);

        phone = new JTextField();
        phone.setBounds(180, 570, 150, 30);

        sumbit = new JButton("Sumbit");
        sumbit.setBounds(100, 720, 80, 35);

        clear = new JButton("Clear");
        clear.setBounds(220, 720, 70, 35);

        checkBox = new JCheckBox();
        checkBox.setText("Terms & Conditions.");
        checkBox.setBounds(150, 620, 150, 50);
        checkBox.setBackground(new Color(0x00ff4d));


        male = new JRadioButton("Male");
        male.setBounds(180, 420, 70, 30);

        male.setBackground(new Color(0x00ff4d));

        female = new JRadioButton("Female");
        female.setBounds(250, 420, 70, 30);
        female.setBackground(new Color(0x00ff4d));
        group = new ButtonGroup();

        group.add(male);
        group.add(female);
        sumbit.addActionListener(this);
        clear.addActionListener(this);


        panel.add(AppName);
        panel.add(title);
        panel.add(name);
        panel.add(nameT);
        panel.add(pass1);
        panel.add(pass);
        panel.add(email1);
        panel.add(email);
        panel.add(gender1);
        panel.add(city1);
        panel.add(city);
        panel.add(country1);
        panel.add(country);
        panel.add(phone1);
        panel.add(phone);
        panel.add(sumbit);
        panel.add(clear);
        panel.add(checkBox);
        panel.add(male);
        panel.add(female);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==sumbit){
            String nameq = email.getText();
            String number = phone.getText();
            //String[] numbers = {"a", "b", "c"};
            if(nameT.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter name first!");
            else if(pass.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter your password!");
            else if(!nameq.contains("@gmail.com"))
                JOptionPane.showMessageDialog(null, "Please enter correct email!");
            else if(group.getSelection()== null)
                JOptionPane.showMessageDialog(null, "Select your Gender!");
            else if(number.contains("a")|| number.contains("b") || number.contains("c")|| number.contains("d")
                    || number.contains("e")|| number.contains("f") || number.contains("g")|| number.contains("h")
                    || number.contains("i")|| number.contains("j") || number.contains("k")|| number.contains("l") || number.contains("m")|| number.contains("n")
                    || number.contains("o")|| number.contains("p") || number.contains("q")|| number.contains("r")
                    || number.contains("s")|| number.contains("t") || number.contains("u")|| number.contains("v") || number.contains("w")|| number.contains("x")
                    || number.contains("y")|| number.contains("z") || number.contains("A")|| number.contains("B")
                    || number.contains("C")|| number.contains("D") || number.contains("E")|| number.contains("F") || number.contains("G")|| number.contains("H")
                    || number.contains("I")|| number.contains("J") || number.contains("K")|| number.contains("L")
                    || number.contains("M")|| number.contains("N") || number.contains("O")|| number.contains("P") || number.contains("Q")|| number.contains("R")
                    || number.contains("S")|| number.contains("T") || number.contains("U")|| number.contains("V")
                    || number.contains("W")|| number.contains("X") || number.contains("Y")|| number.contains("Z") || number.contains("@")|| number.contains("#")
                    || number.contains("!")|| number.contains("$") || number.contains("%")|| number.contains("&")
                    || number.contains("*")|| number.contains("+"))
                JOptionPane.showMessageDialog(null, "Invalid number!");
            else if(checkBox.isSelected()== false)
                JOptionPane.showMessageDialog(null, "Please accept Terms & Conditions");
            else
                JOptionPane.showMessageDialog(null, "Registration Successful");

        }
        else if(ae.getSource()==clear){
            nameT.setText("");
            pass.setText("");
            email.setText("");
            city.setText("");
            country.setText("");
            phone.setText("");
            group.clearSelection();
            checkBox.setSelected(false);

        }
    }

}