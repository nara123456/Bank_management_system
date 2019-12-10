package Bankdetails;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import net.proteanit.sql.DbUtils;



public class account extends javax.swing.JFrame {
    public account() {
        initComponents();
         capan.setVisible(true);
         acc_successful.setVisible(false);
         DEPOSIT_PANEL.setVisible(false);
          acc_Deposit.setVisible(false);
          Balance_money.setVisible(false);
         bal_enquiry.setVisible(false);
          cust_list.setVisible(false);
          with_amount.setVisible(false);
          Withdrawl.setVisible(false);
         trans.setVisible(false);
          transa2.setVisible(false);
       current_date();
        custo_id();
        cust_type();
   Show_table();
        
         }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        deposit_button = new javax.swing.JButton();
        transfer_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        withdraw_button = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        transcation_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        transa2 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        acc_successful = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        acc_name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        acc_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        acc_type = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        acc_no = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        acc_balance = new javax.swing.JTextField();
        acc_sumit = new javax.swing.JButton();
        min = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        acc_Deposit = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        deposit_acc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DEPOSIT_PANEL = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        dep_id = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        de_name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        de_acc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        de_type = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        de_de = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        de_bal = new javax.swing.JTextField();
        dep_money = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        DE_DATE = new javax.swing.JLabel();
        cust_list = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bal_enquiry = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        bala_enq = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Balance_money = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        bala_id = new javax.swing.JTextField();
        bala_name = new javax.swing.JTextField();
        bala_type = new javax.swing.JTextField();
        bala_date = new javax.swing.JTextField();
        bala_bala = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        bale_accno = new javax.swing.JTextField();
        Withdrawl = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        wit_accno = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        with_amount = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        with_id = new javax.swing.JTextField();
        with_name = new javax.swing.JTextField();
        with_type = new javax.swing.JTextField();
        with_wi = new javax.swing.JTextField();
        wit_money = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        with_acc = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        with_bal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        trans = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        capan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cust_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cust_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cust_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cust_contact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cust_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cust_birth = new javax.swing.JTextField();
        create_acc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Management Software");
        getContentPane().setLayout(null);

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bankdetails/person_male_40px.png"))); // NOI18N
        jButton3.setText("Create Account");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        deposit_button.setBackground(new java.awt.Color(255, 255, 255));
        deposit_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deposit_button.setText("  deposit");
        deposit_button.setBorder(null);
        deposit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_buttonActionPerformed(evt);
            }
        });

        transfer_button.setBackground(new java.awt.Color(255, 255, 255));
        transfer_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transfer_button.setText("  Transfer");
        transfer_button.setBorder(null);
        transfer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_buttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\menu_40px.png")); // NOI18N
        jLabel5.setText("   Menu");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        withdraw_button.setBackground(new java.awt.Color(255, 255, 255));
        withdraw_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdraw_button.setText("  withdraw");
        withdraw_button.setBorder(null);
        withdraw_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_buttonActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\withdrawal_limit_40px.png")); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\safe_in_40px.png")); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\online_money_transfer_40px.png")); // NOI18N

        jLabel66.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\transaction_list_40px.png")); // NOI18N

        transcation_button.setBackground(new java.awt.Color(255, 255, 255));
        transcation_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transcation_button.setText("Transcation");
        transcation_button.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0)));
        transcation_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcation_buttonActionPerformed(evt);
            }
        });

        logout_button.setBackground(new java.awt.Color(255, 255, 255));
        logout_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_button.setText("Logout");
        logout_button.setBorder(null);
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        jLabel68.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\Logout Rounded Down_40px.png")); // NOI18N

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Balance Enquiry");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Customer list");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\list_48px.png")); // NOI18N

        jLabel61.setIcon(new javax.swing.ImageIcon("C:\\Users\\Narayan\\Documents\\image\\questions_48px.png")); // NOI18N

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transcation_button)))
                        .addContainerGap())
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30)
                                .addGap(156, 156, 156))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(withdraw_button))
                                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(MenuLayout.createSequentialGroup()
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(deposit_button)
                                            .addGap(66, 66, 66))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuLayout.createSequentialGroup()
                                            .addComponent(jLabel31)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(transfer_button))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(deposit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(transfer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(9, 9, 9)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transcation_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(35, 35, 35)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(Menu);
        Menu.setBounds(0, 0, 230, 860);

        mainpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainpanel.setLayout(new java.awt.CardLayout());

        transa2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("Transaction ");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("A/c No :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Name :");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "", "Title 6"
            }
        ));
        jTable2.setToolTipText("");
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout transa2Layout = new javax.swing.GroupLayout(transa2);
        transa2.setLayout(transa2Layout);
        transa2Layout.setHorizontalGroup(
            transa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transa2Layout.createSequentialGroup()
                .addGroup(transa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transa2Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel54))
                    .addGroup(transa2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(568, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        transa2Layout.setVerticalGroup(
            transa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transa2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addGroup(transa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
        );

        mainpanel.add(transa2, "card13");

        acc_successful.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Account Details");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Name");

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Customer ID");

        acc_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Account Type");

        acc_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Account No");

        acc_no.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Balance");

        acc_balance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        acc_sumit.setBackground(new java.awt.Color(255, 255, 255));
        acc_sumit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acc_sumit.setText("Sumit");
        acc_sumit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_sumitActionPerformed(evt);
            }
        });

        min.setForeground(new java.awt.Color(255, 0, 0));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setText("Email");

        javax.swing.GroupLayout acc_successfulLayout = new javax.swing.GroupLayout(acc_successful);
        acc_successful.setLayout(acc_successfulLayout);
        acc_successfulLayout.setHorizontalGroup(
            acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acc_successfulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acc_sumit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455))
            .addGroup(acc_successfulLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acc_successfulLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel11))
                    .addGroup(acc_successfulLayout.createSequentialGroup()
                        .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel63))
                        .addGap(33, 33, 33)
                        .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acc_id)
                                .addComponent(acc_name)
                                .addComponent(acc_type)
                                .addComponent(acc_no)
                                .addComponent(acc_balance, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                            .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        acc_successfulLayout.setVerticalGroup(
            acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_successfulLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(53, 53, 53)
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(acc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(acc_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(acc_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(acc_successfulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acc_successfulLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel63))
                    .addGroup(acc_successfulLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(acc_sumit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        mainpanel.add(acc_successful, "card3");

        acc_Deposit.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Deposit Money ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Enter Account No");

        deposit_acc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Sumit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acc_DepositLayout = new javax.swing.GroupLayout(acc_Deposit);
        acc_Deposit.setLayout(acc_DepositLayout);
        acc_DepositLayout.setHorizontalGroup(
            acc_DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_DepositLayout.createSequentialGroup()
                .addGroup(acc_DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acc_DepositLayout.createSequentialGroup()
                        .addGap(523, 523, 523)
                        .addComponent(jLabel17))
                    .addGroup(acc_DepositLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel18)
                        .addGap(54, 54, 54)
                        .addGroup(acc_DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deposit_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        acc_DepositLayout.setVerticalGroup(
            acc_DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_DepositLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(acc_DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(deposit_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        mainpanel.add(acc_Deposit, "card4");

        DEPOSIT_PANEL.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Customer ID   :");

        dep_id.setEditable(false);
        dep_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Name               :");

        de_name.setEditable(false);
        de_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Account No     :");

        de_acc.setEditable(false);
        de_acc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Balance           :");

        de_type.setEditable(false);
        de_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Deposit           :");

        de_de.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Account Type :");

        de_bal.setEditable(false);
        de_bal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        dep_money.setBackground(new java.awt.Color(51, 255, 0));
        dep_money.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dep_money.setText("Sumit");
        dep_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_moneyActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BYCASH", "CHEQUE" }));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Deposit Type  :");

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Deposit ");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("DATE :");

        DE_DATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DE_DATE.setForeground(new java.awt.Color(255, 255, 255));
        DE_DATE.setText("DE_DATE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(262, 262, 262)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DE_DATE)
                .addGap(164, 164, 164))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(DE_DATE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout DEPOSIT_PANELLayout = new javax.swing.GroupLayout(DEPOSIT_PANEL);
        DEPOSIT_PANEL.setLayout(DEPOSIT_PANELLayout);
        DEPOSIT_PANELLayout.setHorizontalGroup(
            DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DEPOSIT_PANELLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dep_id)
                    .addComponent(de_name)
                    .addComponent(de_acc)
                    .addComponent(de_type)
                    .addComponent(de_de)
                    .addComponent(de_bal, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(dep_money, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(316, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DEPOSIT_PANELLayout.setVerticalGroup(
            DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DEPOSIT_PANELLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(dep_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addGroup(DEPOSIT_PANELLayout.createSequentialGroup()
                        .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(de_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(27, 27, 27)
                        .addComponent(de_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(de_type, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(de_bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(de_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(DEPOSIT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel59))
                .addGap(75, 75, 75)
                .addComponent(dep_money, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        mainpanel.add(DEPOSIT_PANEL, "card5");

        cust_list.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Customer List");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout cust_listLayout = new javax.swing.GroupLayout(cust_list);
        cust_list.setLayout(cust_listLayout);
        cust_listLayout.setHorizontalGroup(
            cust_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(cust_listLayout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jLabel32)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        cust_listLayout.setVerticalGroup(
            cust_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cust_listLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        mainpanel.add(cust_list, "card6");

        bal_enquiry.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setText("Balance Enquiry");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Enter Account No        :");

        bala_enq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Sumit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bal_enquiryLayout = new javax.swing.GroupLayout(bal_enquiry);
        bal_enquiry.setLayout(bal_enquiryLayout);
        bal_enquiryLayout.setHorizontalGroup(
            bal_enquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bal_enquiryLayout.createSequentialGroup()
                .addGroup(bal_enquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bal_enquiryLayout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(jLabel33))
                    .addGroup(bal_enquiryLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(bala_enq, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bal_enquiryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(499, 499, 499))
        );
        bal_enquiryLayout.setVerticalGroup(
            bal_enquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bal_enquiryLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel33)
                .addGap(118, 118, 118)
                .addGroup(bal_enquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(bala_enq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        mainpanel.add(bal_enquiry, "card7");

        Balance_money.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Balance Enquiry");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Customer ID    :");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Name               :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Account Type  :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Balance");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Account Open : ");

        bala_id.setEditable(false);
        bala_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bala_name.setEditable(false);
        bala_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bala_type.setEditable(false);
        bala_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bala_date.setEditable(false);
        bala_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bala_bala.setEditable(false);
        bala_bala.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setText("Account No     :");

        bale_accno.setEditable(false);
        bale_accno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout Balance_moneyLayout = new javax.swing.GroupLayout(Balance_money);
        Balance_money.setLayout(Balance_moneyLayout);
        Balance_moneyLayout.setHorizontalGroup(
            Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Balance_moneyLayout.createSequentialGroup()
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Balance_moneyLayout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(jLabel35))
                    .addGroup(Balance_moneyLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel52))
                        .addGap(55, 55, 55)
                        .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bala_id)
                            .addComponent(bala_name)
                            .addComponent(bala_type)
                            .addComponent(bala_date)
                            .addComponent(bala_bala, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(bale_accno))))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        Balance_moneyLayout.setVerticalGroup(
            Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Balance_moneyLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel35)
                .addGap(68, 68, 68)
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(bala_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Balance_moneyLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel37))
                    .addGroup(Balance_moneyLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(bala_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(bala_type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(bala_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(bale_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(Balance_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bala_bala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        mainpanel.add(Balance_money, "card8");

        Withdrawl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText("Withdrawl");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Enter Account No    :");

        wit_accno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Sumit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WithdrawlLayout = new javax.swing.GroupLayout(Withdrawl);
        Withdrawl.setLayout(WithdrawlLayout);
        WithdrawlLayout.setHorizontalGroup(
            WithdrawlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawlLayout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(wit_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WithdrawlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(544, 544, 544))
        );
        WithdrawlLayout.setVerticalGroup(
            WithdrawlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawlLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel41)
                .addGap(117, 117, 117)
                .addGroup(WithdrawlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(wit_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        mainpanel.add(Withdrawl, "card9");

        with_amount.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("Customer ID             :");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText("Name                         :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("      Account Type           :");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setText("Withdrawl                 :");

        with_id.setEditable(false);
        with_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        with_name.setEditable(false);
        with_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        with_type.setEditable(false);
        with_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        with_wi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        with_wi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                with_wiActionPerformed(evt);
            }
        });

        wit_money.setBackground(new java.awt.Color(102, 255, 51));
        wit_money.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wit_money.setText("Sumit");
        wit_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wit_moneyActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setText("Account No               :");

        with_acc.setEditable(false);
        with_acc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("Balance                     :");

        with_bal.setEditable(false);
        with_bal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Withdrawl Money");

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Date  :");

        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setText("jLabel52");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(date2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addContainerGap())
        );

        javax.swing.GroupLayout with_amountLayout = new javax.swing.GroupLayout(with_amount);
        with_amount.setLayout(with_amountLayout);
        with_amountLayout.setHorizontalGroup(
            with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(with_amountLayout.createSequentialGroup()
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(with_amountLayout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel44)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(with_amountLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(with_amountLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(73, 73, 73)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(with_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(with_id, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(with_type, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(with_acc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(with_wi)
                    .addComponent(with_bal, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(173, 173, 173))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, with_amountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(wit_money, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
        );
        with_amountLayout.setVerticalGroup(
            with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(with_amountLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(with_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(with_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(42, 42, 42)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(with_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(with_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(with_wi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(with_amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(with_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addComponent(wit_money, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        mainpanel.add(with_amount, "card10");

        trans.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setText("Transcation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setText("Enter Account no :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transLayout = new javax.swing.GroupLayout(trans);
        trans.setLayout(transLayout);
        transLayout.setHorizontalGroup(
            transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(transLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addGroup(transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        transLayout.setVerticalGroup(
            transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );

        mainpanel.add(trans, "card11");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        mainpanel.add(jPanel14, "card12");

        capan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Customer ID");

        cust_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name");

        cust_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cust_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Address");

        cust_address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cust_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_addressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Contact");

        cust_contact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Account Type");

        cust_combo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cust_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving", "Current" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Gender");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Birth");

        cust_birth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cust_birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_birthActionPerformed(evt);
            }
        });

        create_acc.setBackground(new java.awt.Color(153, 255, 102));
        create_acc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_acc.setText("Submit");
        create_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_accActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Account");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date :");

        Date.setBackground(new java.awt.Color(255, 255, 255));
        Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("date");
        Date.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Date))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Email ID");

        email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout capanLayout = new javax.swing.GroupLayout(capan);
        capan.setLayout(capanLayout);
        capanLayout.setHorizontalGroup(
            capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(create_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(459, 459, 459))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capanLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(capanLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel62)))
                    .addComponent(jLabel4))
                .addGap(157, 157, 157)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cust_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(cust_address, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(cust_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cust_id, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(cust_name)
                    .addComponent(cust_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(capanLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jRadioButton2))
                    .addComponent(email))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        capanLayout.setVerticalGroup(
            capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capanLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cust_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cust_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(capanLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cust_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(capanLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)))
                .addGap(28, 28, 28)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cust_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cust_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cust_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(capanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(capanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62))
                    .addGroup(capanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addComponent(create_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        mainpanel.add(capan, "card2");

        getContentPane().add(mainpanel);
        mainpanel.setBounds(230, 0, 1150, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 Connection conn;
 PreparedStatement ps;
   PreparedStatement ps1;
  ResultSet rs;
    ResultSet rs2;

public final void sendemail(){


}
    public final void custo_id()
 {
        try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            String sql="select max(cust_id) from CREATE_ACCOUNT";
            ps=conn.prepareStatement(sql);
             rs=ps.executeQuery();
            rs.next();
            if(rs.getString("max(cust_id)")==null)
            {
              cust_id.setText("A001");
            }
            else
            {
                long cu_id=Long.parseLong(rs.getString("Max(cust_id)").substring(2,rs.getString("Max(cust_id)").length()));
                cu_id++;
                cust_id.setText("A"+String.format("%03d",cu_id));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
   public final void Show_table()
    {   
    }
 public final void cust_type()
 {
        try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            String sql="select * from account_type";
            ps=conn.prepareStatement(sql);
           rs=ps.executeQuery();
            cust_combo.removeAllItems();
            while(rs.next())
            {
              cust_combo.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 public final void current_date()
 {
         DateTimeFormatter da=DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDateTime now=LocalDateTime.now();
         String date1=da.format(now);
         DE_DATE.setText(date1);
         //daa.setText(date1);
         Date.setText(date1);
         date2.setText(date1);
 }
 
    @SuppressWarnings("DeadBranch")
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        try {
           
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            String sql="select * from create_account where cust_id='"+acc_id.getText()+"'";
             PreparedStatement ps3=conn.prepareStatement(sql);
             rs=ps3.executeQuery();
            if(rs.next()==true)
             {
               capan.setVisible(false);
     acc_successful.setVisible(true);
     DEPOSIT_PANEL.setVisible(false);
      acc_Deposit.setVisible(false);
      Balance_money.setVisible(false);
      cust_list.setVisible(false);
      bal_enquiry.setVisible(false);
      with_amount.setVisible(false);
      Withdrawl.setVisible(false);
       trans.setVisible(false);
       transa2.setVisible(false);
            }
            else{
             capan.setVisible(true);
     acc_successful.setVisible(false);
     DEPOSIT_PANEL.setVisible(false);
      acc_Deposit.setVisible(false);
      Balance_money.setVisible(false);
      cust_list.setVisible(false);
      bal_enquiry.setVisible(false);
      with_amount.setVisible(false);
      Withdrawl.setVisible(false);
       trans.setVisible(false);
       transa2.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void withdraw_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_buttonActionPerformed
     capan.setVisible(false);
     acc_successful.setVisible(false);
     DEPOSIT_PANEL.setVisible(false);
      acc_Deposit.setVisible(false);
      Balance_money.setVisible(false);
      bal_enquiry.setVisible(false);
      cust_list.setVisible(false);
      with_amount.setVisible(false);
      Withdrawl.setVisible(true);
   trans.setVisible(false);
   transa2.setVisible(false);
    }//GEN-LAST:event_withdraw_buttonActionPerformed

    private void deposit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_buttonActionPerformed
     capan.setVisible(false);
     acc_successful.setVisible(false);
     DEPOSIT_PANEL.setVisible(false);
     acc_Deposit.setVisible(true);
     with_amount.setVisible(false);
     Balance_money.setVisible(false);
     bal_enquiry.setVisible(false);
     cust_list.setVisible(false);
     Withdrawl.setVisible(false);
   trans.setVisible(false);
   transa2.setVisible(false);
    }//GEN-LAST:event_deposit_buttonActionPerformed

    private void transfer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_buttonActionPerformed
      capan.setVisible(false);
      acc_successful.setVisible(false);
      DEPOSIT_PANEL.setVisible(false);
       acc_Deposit.setVisible(false);
       Balance_money.setVisible(false);
       bal_enquiry.setVisible(false);
       cust_list.setVisible(false);
       Withdrawl.setVisible(false);
       with_amount.setVisible(false);
        trans.setVisible(false);
  transa2.setVisible(false);
    }//GEN-LAST:event_transfer_buttonActionPerformed

    private void transcation_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcation_buttonActionPerformed
       capan.setVisible(false);
       acc_successful.setVisible(false);
       DEPOSIT_PANEL.setVisible(false);
       acc_Deposit.setVisible(false);
       Balance_money.setVisible(false);
       bal_enquiry.setVisible(false);
       cust_list.setVisible(false);
       Withdrawl.setVisible(false);
       with_amount.setVisible(false);
       trans.setVisible(true);
       transa2.setVisible(false);
    }//GEN-LAST:event_transcation_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
                 this.hide();
                 Login l1=new Login();
                 l1.setVisible(true); 
                 l1.setBounds(200,100,817,568);
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
                   try{
         conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
     String sql="select cust_id,cust_name,acc_type,acc_no,balance from acc";  
      ps=conn.prepareStatement(sql);
             rs=ps.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
              capan.setVisible(false);
              with_amount.setVisible(false);
      
        
      acc_successful.setVisible(false);
      DEPOSIT_PANEL.setVisible(false);
      acc_Deposit.setVisible(false);
      Withdrawl.setVisible(false);
      cust_list.setVisible(true);
      Balance_money.setVisible(false);
      bal_enquiry.setVisible(false);
        transa2.setVisible(false);
          
            
   }
   catch(SQLException ex)
   {
         JOptionPane.showMessageDialog(this,ex);
   }finally{
       try{
           rs.close();
           ps.close();
       }
       catch(SQLException e)
       {
             JOptionPane.showMessageDialog(this,"e");
       }
   }
         
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        capan.setVisible(false);
        acc_successful.setVisible(false);
        DEPOSIT_PANEL.setVisible(false);
        acc_Deposit.setVisible(false);
        Balance_money.setVisible(false);  
        bal_enquiry.setVisible(true);
        cust_list.setVisible(false);
        Withdrawl.setVisible(false);
        with_amount.setVisible(false);
       trans.setVisible(false);
       transa2.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cust_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_nameActionPerformed
       
    }//GEN-LAST:event_cust_nameActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        gen="male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void cust_birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_birthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cust_birthActionPerformed

    private void create_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_accActionPerformed
        String b0=cust_name.getText();
        String b1=cust_address.getText();
        String b2=" ";
        Random rand=new Random();
        long n=rand.nextInt(1000000001);
        n+=1;
        String random=Long.toString(n);
        acc_no.setText(random);
        try{
            if(b0==b2 || b1==b2){
                JOptionPane.showMessageDialog(null,"some data is missing");
            }
            else{
                String combo=cust_combo.getSelectedItem().toString();
                acc_type.setText(combo);
                String cust_id1=cust_id.getText();
                acc_id.setText(cust_id1);
                String cust_name1=cust_name.getText();
                acc_name.setText(cust_name1);
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
                ps=conn.prepareStatement("insert into create_account(cust_id,name,address,contact,account_type,gender,birth,accounts,date1,email) values(?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,cust_id.getText());
                ps.setString(2,cust_name.getText());
                ps.setString(3,cust_address.getText());
                ps.setString(4,cust_contact.getText());
                ps.setString(5,combo);
                ps.setString(6,gen);
                ps.setString(7,cust_birth.getText());
                ps.setString(8,acc_no.getText());
                ps.setString(9,Date.getText());
                ps.setString(10,email.getText());
                
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null,"Account Created");
                
	
		
                transa2.setVisible(false);
                capan.setVisible(false);
                acc_successful.setVisible(true);
                DEPOSIT_PANEL.setVisible(false);
                acc_Deposit.setVisible(false);
                Balance_money.setVisible(false);
                cust_list.setVisible(false);
                bal_enquiry.setVisible(false);
                with_amount.setVisible(false);
                Withdrawl.setVisible(false);
                 trans.setVisible(false);
            }
        }
        catch(SQLException ex)
        {
            System.out.print(ex); 
        }
    }//GEN-LAST:event_create_accActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      gen="Female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void acc_sumitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_sumitActionPerformed
       try{
                String a=cust_id.getText();
                String a1=cust_name.getText();
                String a2=acc_type.getText();
                String a3=acc_no.getText();
                String a4=acc_balance.getText();
                String a5=email2.getText();
                  long b1=Long.parseLong(a4);
                  if(b1>=1000){
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
     ps=conn.prepareStatement("insert into acc(cust_id,cust_name,acc_type,acc_no,balance,email) values(?,?,?,?,?,?)");
      ps.setString(1,a);
     ps.setString(2,a1);
     ps.setString(3,a2);
      ps.setString(4,a3);
      ps.setString(5,a4);
      ps.setString(6,a5);
      ps.executeUpdate();
     
        JOptionPane.showMessageDialog(null,"Details inserted");
        
  Properties pros=new Properties();
   String host="smtp.gmail.com";
   String to= email2.getText();
   String subject="deposit-details";
   String message="your Account has credited"+" "+a4;
          

   pros.put("mail.smtp.host",host);
    pros.put("mail.smtp.socketFactory.port","465");
    pros.put("mail.imap.ssl.enable", "true");
     pros.put("mail.smtp.port","465");
     
     pros.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
     
   pros.put("mail.smtp.auth","true");
  
   Session session=Session.getDefaultInstance(pros,new javax.mail.Authenticator(){
   
        
    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
       return new PasswordAuthentication("panigrahinarayan256@gmail.com","sksomaiya.edu");
    }
    });
  
    
  try{ 
      
   Message msg=new MimeMessage(session);
   msg.setFrom(new InternetAddress("panigrahinarayan256@gmail.com"));
   msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
   msg.setSubject(subject);
   msg.setText(message);
    Transport.send(msg);
    JOptionPane.showMessageDialog(null,"Email has been send");
  }
  catch(Exception e)
  {
        
        JOptionPane.showMessageDialog(null,e);
  }
       
         cust_name.setText("");
        cust_address.setText("");
        cust_contact.setText("");
        cust_birth.setText(""); 
        acc_type.setText("");
       acc_balance.setText("");
       min.setText("");
       acc_name.setText("");
       acc_id.setText("");
       acc_no.setText("");
       custo_id();
       
                  }
                  else
                  {
                      min.setText("minimum balance should be 1000");
                  }
       }
       catch(SQLException ex)
       {
        System.out.print(ex);
       }
    }//GEN-LAST:event_acc_sumitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
             
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            ps1=conn.prepareStatement("select create_account.cust_id,create_account.name,create_account.account_type,create_account.accounts,acc.balance from create_account,acc where create_account.cust_id=acc.cust_id and acc.acc_no=?");
            ps1.setString(1,deposit_acc.getText());
            rs2=ps1.executeQuery();
            if(rs2.next())
            {
             String dep_idi=rs2.getString(1);
             String dep_nam=rs2.getString(2);
             String dep_acctype=rs2.getString(3);
             String dep_acc=rs2.getString(4);
              String dep_bal=rs2.getString(5);
              
              dep_id.setText(dep_idi);
              de_name.setText(dep_nam);
              de_type.setText(dep_acctype);
              de_acc.setText(dep_acc);
              de_bal.setText(dep_bal);
              de_de.setText("0");
              capan.setVisible(false);
              acc_successful.setVisible(false);
               acc_Deposit.setVisible(false);
              DEPOSIT_PANEL.setVisible(true);
              Balance_money.setVisible(false);
              bal_enquiry.setVisible(false);
              cust_list.setVisible(false);
              with_amount.setVisible(false);
              Withdrawl.setVisible(false);
               trans.setVisible(false);
               transa2.setVisible(false);
            }
            else
            {
                  JOptionPane.showMessageDialog(null,"ACCOUNT NOT FOUND");  
            }
        }
     catch(SQLException ex)
             {
               System.out.print(ex);
             }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dep_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_moneyActionPerformed
        long a1;
        long a2;
        String depo_type=jComboBox1.getSelectedItem().toString();
        a1 = Long.parseLong(de_de.getText());
        a2=Long.parseLong(de_bal.getText());
        long a3=a1+a2;
        String f1= Long.toString(a3);
        try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            if(0==a1){
                JOptionPane.showMessageDialog(null,"you have not enter value");  
            }else{
                ps=conn.prepareStatement("insert into depositing(accounts_id,cust_id,dated,balance,deposited,particular) values(?,?,?,?,?,?)");
                ps.setString(1,de_acc.getText());
                ps.setString(2,dep_id.getText());
                ps.setString(3,DE_DATE.getText());
                
                ps.setString(4,f1);
                ps.setString(5,de_de.getText());
                ps.setString(6,depo_type);
                ps.executeQuery();
                
                ps=conn.prepareStatement("update acc set balance = balance+ ? where acc_no=?");
                ps.setString(1,de_de.getText());
                ps.setString(2,de_acc.getText());
                ps.executeQuery();
                JOptionPane.showMessageDialog(null,"Money Deposited");
                                                                    
             /*   de_acc.setText("");
                dep_id.setText("");
                de_name.setText("");
                de_bal.setText("");
                de_de.setText("");
                de_type.setText("");*/
               
                 
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_dep_moneyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            ps=conn.prepareStatement("select create_account.cust_id,create_account.name,create_account.account_type,create_account.accounts,create_account.date1,acc.balance from create_account,acc where create_account.cust_id=acc.cust_id and acc.acc_no=?");
            ps.setString(1,bala_enq.getText());
            rs=ps.executeQuery();
            if(rs.next())
            {
                  String bal_custid= rs.getString(1);
                 String bal_custname=rs.getString(2);
                  String bal_acc_type=rs.getString(3);
                  String bal_ac=rs.getString(4);
                  String bal_date=rs.getString(5);
                 String bal_bal=rs.getString(6);
                 bala_id.setText(bal_custid);
                 bala_name.setText(bal_custname);
                 bale_accno.setText(bal_ac);
                 bala_date.setText(bal_date);
                 bala_bala.setText(bal_bal);
                 bala_type.setText(bal_acc_type);
                  capan.setVisible(false);
              acc_successful.setVisible(false);
               acc_Deposit.setVisible(false);
              DEPOSIT_PANEL.setVisible(false);
              Balance_money.setVisible(true);
              cust_list.setVisible(false);
              bal_enquiry.setVisible(false);
                with_amount.setVisible(false);
                Withdrawl.setVisible(false);
                 trans.setVisible(false);
                 transa2.setVisible(false);
            }
            else{
             JOptionPane.showMessageDialog(null,"ACCOUNT NOT FOUND");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            ps=conn.prepareStatement("select create_account.cust_id,create_account.name,create_account.account_type,create_account.accounts,create_account.date1,acc.balance from create_account,acc where create_account.cust_id=acc.cust_id and acc.acc_no=?");
            ps.setString(1,wit_accno.getText());
            rs=ps.executeQuery();
            if(rs.next())
            {
               String with_custid= rs.getString(1);
                 String with_custname=rs.getString(2);
                  String with_acc_type=rs.getString(3);
                  String with_acc_no2=rs.getString(4);
                
                 String with_bal1=rs.getString(6);  
                 with_id.setText(with_custid);
                 with_name.setText(with_custname);
                 with_type.setText(with_acc_type);
                 with_acc.setText(with_acc_no2);
                 trans.setVisible(false);
                 with_bal.setText(with_bal1);
                 with_amount.setVisible(true);
                  capan.setVisible(false);
              acc_successful.setVisible(false);
               acc_Deposit.setVisible(false);
              DEPOSIT_PANEL.setVisible(false);
              Balance_money.setVisible(false);
              bal_enquiry.setVisible(false);
              cust_list.setVisible(false);
              Withdrawl.setVisible(false);
              transa2.setVisible(false);
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"ACCOUNT NOT FOUND");  
            }
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void with_wiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_with_wiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_with_wiActionPerformed

    private void wit_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wit_moneyActionPerformed
                   String a1=with_id.getText();
                   String a2=date2.getText();        
                   String a3=with_bal.getText();   
                   String a4=with_wi.getText();
                   String a5=with_acc.getText();
        try {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
             ps=conn.prepareStatement("insert into withdrawl(acc_number,cust_id,dated,balance,withdraw) values(?,?,?,?,?)");
             ps.setString(1,a5);
             ps.setString(2,a1);
             ps.setString(3,a2);
             ps.setString(4,a3);
             ps.setString(5,a4);
             
             ps.executeUpdate();
             long a=Long.parseLong(a3);
             long b=Long.parseLong(a4);
             
             if(a <= b){
                 JOptionPane.showMessageDialog(null,"less balance");
             }
             else if(a<=1000){
                   JOptionPane.showMessageDialog(null,"balance should minimum 1000");
             }
             else{
                 ps=conn.prepareStatement("update acc set balance = balance- ? where acc_no=?");   
                 ps.setString(1,a4);
                 ps.setString(2,a5);
                 ps.executeUpdate();
                  ps1=conn.prepareStatement("select balance from acc where acc_no=?");
            ps1.setString(1,wit_accno.getText());
            rs=ps1.executeQuery();
            //  ps=conn.prepareStatement("select create_account.cust_id,create_account.name,create_account.account_type,create_account.accounts,create_account.date1,acc.balance from create_account,acc where create_account.cust_id=acc.cust_id and acc.acc_no=?");
        
            
            if(rs.next()){
                   String bal=rs.getString(1);
            
            with_bal.setText(bal);
            
                JOptionPane.showMessageDialog(null,"money withdraw");
            }
                 
             }
    
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_wit_moneyActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
               
        try{
         conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:NARAYAN","system","narayan");
            String sql="select * from create_account where accounts='"+jTextField1.getText()+"'";
             PreparedStatement ps3=conn.prepareStatement(sql);
             rs=ps3.executeQuery();
             if(rs.next()==true){
             with_amount.setVisible(false);
                  capan.setVisible(false);
              acc_successful.setVisible(false);
               acc_Deposit.setVisible(false);
              DEPOSIT_PANEL.setVisible(false);
              Balance_money.setVisible(false);
              bal_enquiry.setVisible(false);
              cust_list.setVisible(false);
              Withdrawl.setVisible(false);
              trans.setVisible(false);
              transa2.setVisible(true);
            String sql1="select dated,particular,deposited,balance from depositing where accounts_id='"+jTextField1.getText()+"'";
        
           ps=conn.prepareStatement(sql1);
           rs=ps.executeQuery(sql1);
           if(rs.next())
           {
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           }
             } else
             {
              JOptionPane.showMessageDialog(null,"Account no find");
             }
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e);
    }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cust_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cust_addressActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      int x=200;
        if(x==0)
      {
          Menu.show();
      Menu.setSize(210,552);
      Thread th =new Thread(){
      
      public void run()
      {
      try{
      for(int i=0;i<=200;i++){
      Thread.sleep(i);
      Menu.setSize(1,552);
      }
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,e);
      }
      }
      };
              th.start();
              x=210;
      }
      
    }//GEN-LAST:event_jLabel5MouseClicked
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account().setVisible(true);             
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Balance_money;
    private javax.swing.JPanel DEPOSIT_PANEL;
    private javax.swing.JLabel DE_DATE;
    private javax.swing.JLabel Date;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Withdrawl;
    private javax.swing.JPanel acc_Deposit;
    private javax.swing.JTextField acc_balance;
    private javax.swing.JTextField acc_id;
    private javax.swing.JTextField acc_name;
    private javax.swing.JTextField acc_no;
    private javax.swing.JPanel acc_successful;
    private javax.swing.JButton acc_sumit;
    private javax.swing.JTextField acc_type;
    private javax.swing.JPanel bal_enquiry;
    private javax.swing.JTextField bala_bala;
    private javax.swing.JTextField bala_date;
    private javax.swing.JTextField bala_enq;
    private javax.swing.JTextField bala_id;
    private javax.swing.JTextField bala_name;
    private javax.swing.JTextField bala_type;
    private javax.swing.JTextField bale_accno;
    private javax.swing.JPanel capan;
    private javax.swing.JButton create_acc;
    private javax.swing.JTextField cust_address;
    private javax.swing.JTextField cust_birth;
    private javax.swing.JComboBox<String> cust_combo;
    private javax.swing.JTextField cust_contact;
    private javax.swing.JTextField cust_id;
    private javax.swing.JPanel cust_list;
    private javax.swing.JTextField cust_name;
    private javax.swing.JLabel date2;
    private javax.swing.JTextField de_acc;
    private javax.swing.JTextField de_bal;
    private javax.swing.JTextField de_de;
    private javax.swing.JTextField de_name;
    private javax.swing.JTextField de_type;
    private javax.swing.JTextField dep_id;
    private javax.swing.JButton dep_money;
    private javax.swing.JTextField deposit_acc;
    private javax.swing.JButton deposit_button;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel min;
    private javax.swing.JPanel trans;
    private javax.swing.JPanel transa2;
    private javax.swing.JButton transcation_button;
    private javax.swing.JButton transfer_button;
    private javax.swing.JTextField wit_accno;
    private javax.swing.JButton wit_money;
    private javax.swing.JTextField with_acc;
    private javax.swing.JPanel with_amount;
    private javax.swing.JTextField with_bal;
    private javax.swing.JTextField with_id;
    private javax.swing.JTextField with_name;
    private javax.swing.JTextField with_type;
    private javax.swing.JTextField with_wi;
    private javax.swing.JButton withdraw_button;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelative(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String gen;
}
