/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author user
 */

public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    public mainpage() {
        setContentPane(new JLabel(new ImageIcon("D:/ENTC/Show/thiss.jpg")));
        initComponents();
         String url = "jdbc:mysql://localhost:3306/barcode";
            String username = "root";
            String pwd = "varad11041997";
             try{
              try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception ex) {

            }   
                 Connection con = DriverManager.getConnection(url, username, pwd);
                Statement stmt = con.createStatement();
                int cap=250;
                String vkr="Select * from stud";
                
                ResultSet rsxd=stmt.executeQuery(vkr);
               
                int m=0;
                while(rsxd.next()){
                    if(rsxd.getString(7).equals("1"))m++;
                }
                go.setText(Integer.toString(cap-m));
                if((cap-m)==0){
                    JOptionPane.showMessageDialog(null, "READING HALL FULL!!");
                    return ;
                }
             }catch(Exception ex){
                 
             }
             inituid();
             band();
    }
    public void inituid() {
            String tt = new SimpleDateFormat("dd.MM.YY.HH.mm.ss").format(new java.util.Date());
             String naam=tt.charAt(0)+""+tt.charAt(1)+"."+tt.charAt(3)+tt.charAt(4)+"."+tt.charAt(6)+tt.charAt(7)+".txt";
             String saal="";
              String ch=tt.charAt(6)+""+tt.charAt(7);
              if(ch.equals("18")){
                  saal="2018";
              }
              if(ch.equals("19")){
                  saal="2019";
              }
              if(ch.equals("20")){
                  saal="2020";
              }
              if(ch.equals("21")){
                  saal="2021";
              }
              if(ch.equals("22")){
                  saal="2022";
              }
              if(ch.equals("23")){
                  saal="2023";
              }
              String mon="";
              ch=tt.charAt(3)+""+tt.charAt(4);
              if(ch.equals("01")){
                  mon="JAN";
              }
              if(ch.equals("02")){
                  mon="FEB";
              }
              if(ch.equals("03")){
                  mon="MAR";
              }
              if(ch.equals("04")){
                  mon="APRIL";
              }
              
              if(ch.equals("05")){
                  mon="MAY";
              }
              if(ch.equals("06")){
                  mon="JUN";
              }
              if(ch.equals("07")){
                  mon="JUL";
              }
              if(ch.equals("08")){
                  mon="AUG";
              }
              
              if(ch.equals("09")){
                  mon="SEPT";
              }
              if(ch.equals("10")){
                  mon="OCT";
              }
              if(ch.equals("11")){
                  mon="NOV";
              }
              if(ch.equals("12")){
                  mon="DEC";
              }
        try {           int yes=0;
                        System.out.println("ho");
                        Path p = Paths.get("mainfile.txt");
                  
                        boolean exists = Files.exists(p);
                        boolean notExists = Files.notExists(p);
                        if(exists){
                            BufferedReader file = new BufferedReader(new FileReader("mainfile.txt"));
                         String line="";
                        StringBuffer inputBuffer = new StringBuffer();
                          int f=0;
                        while ((line=file.readLine()) != null) {
                            inputBuffer.append(line);     
                            System.out.println(line);
                            inputBuffer.append("\n");
                        }
                        Set<String> god = new HashSet<String>();
                        file.close();
                        String fk=inputBuffer.toString();
                        System.out.println(fk);
                        
                        String rol="";
                          for(int i=0;i<fk.length()-9;i++){
                              rol="";
                              int ff=0;
                              if(fk.charAt(i)=='E' && fk.charAt(i+1)=='N' && fk.charAt(i+2)=='T' && fk.charAt(i+3)=='C'){
                                  rol=Character.toString(fk.charAt(i+8))+Character.toString(fk.charAt(i+9))+Character.toString(fk.charAt(i+10))+Character.toString(fk.charAt(i+11));
                                   if(fk.charAt(i+12)>=48&&fk.charAt(i+12)<=57){
                                      rol+=fk.charAt(i+12);
                                  }
                                   ff=1;
                                   if(ff==1)god.add(rol);
                              }
                              if(fk.charAt(i)=='C' && fk.charAt(i+1)=='O' && fk.charAt(i+2)=='M' && fk.charAt(i+3)=='P'){
                                  rol=Character.toString(fk.charAt(i+8))+Character.toString(fk.charAt(i+9))+Character.toString(fk.charAt(i+10))+Character.toString(fk.charAt(i+11));
                                  if(fk.charAt(i+12)>=48&&fk.charAt(i+12)<=57){
                                      rol+=fk.charAt(i+12);
                                  }
                                  ff=1;
                                  System.out.println(rol);
                                  if(ff==1)god.add(rol);
                              }
                              if(fk.charAt(i)=='I' && fk.charAt(i+1)=='T'){
                                  rol=Character.toString(fk.charAt(i+6))+Character.toString(fk.charAt(i+7))+Character.toString(fk.charAt(i+8))+Character.toString(fk.charAt(i+9));
                                   if(fk.charAt(i+10)>=48&&fk.charAt(i+10)<=57){
                                      rol+=fk.charAt(i+10);
                                  }
                                  ff=1;
                                  if(ff==1)god.add(rol);
                              }
                          }
                          int c=0;
                            System.out.println(god);     
                            for(String s:god){
                                if(s.charAt(0)<48||s.charAt(0)>57){
                                    
                                }else{
                                    c++;
                                }
                            }
                          uid.setText(Integer.toString(c));
                        }else{
                            uid.setText("-10");
                        }
        }catch(IOException e){
            
        }
            
    }
    public void band(){
        
        Thread xx=new Thread(){
          public void run(){
              for(;;){
                  
                  try {
                      TimeUnit.SECONDS.sleep(1);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  //System.out.println("hi");
                  String yd=endt.getText();
                  int aa=Integer.valueOf(yd);
                  aa=aa+12;
                  String xd=Integer.toString(aa);
                  String tt = new SimpleDateFormat("HH").format(new java.util.Date());
                  if(tt.equals(xd)) {
                      JOptionPane.showMessageDialog(null, "CLOSING SYSTEM IN 10 SECONDS");
                      try {
                          TimeUnit.SECONDS.sleep(5);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      endd.doClick();
                      break;
                  }
              }
          }  
        };
        xx.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enroll = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        endd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        go = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        endt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enroll.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enrollFocusGained(evt);
            }
        });
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollActionPerformed(evt);
            }
        });
        enroll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enrollKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        endd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        endd.setText("END DAY");
        endd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CAPACITY:");

        go.setEditable(false);
        go.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CHANGE END TIME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DAY ENDS AT:");

        endt.setEditable(false);
        endt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        endt.setText("10");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BARCODE OPERATED REGISTER SYSTEM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("UNIQUE ENTRIES:");

        uid.setEditable(false);
        uid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(659, 659, 659)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(140, 140, 140)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(229, 229, 229)
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(endt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(go)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(endt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollActionPerformed
        // TODO add your handling code here:
               

    }//GEN-LAST:event_enrollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception ex) {

            }
            String url = "jdbc:mysql://localhost:3306/barcode";
            String username = "root";
            String pwd = "varad11041997";
            {   Connection con = DriverManager.getConnection(url, username, pwd);
                Statement stmt = con.createStatement();
                String s=enroll.getText();
                enroll.setText("");
                String Quer ="SELECT name FROM stud" ;
                ResultSet rs1=stmt.executeQuery(Quer);
                int kxd=0;
                while(rs1.next()){
                    int l=rs1.getString(1).length();
                    if(l>kxd){
                        kxd=l;
                    }
                }        
                String Query ="SELECT * FROM stud WHERE REG_ID LIKE '%"+s+"%'" ;
                ResultSet rs=stmt.executeQuery(Query);
                
               while(rs.next()){ 
                   String ss=rs.getString(7);
                   if(ss.equals("0")){int lines=0;
                       try {BufferedReader reader = new BufferedReader(new FileReader("mainfile.txt"));
                 
                        while (reader.readLine() != null) lines++;
                        reader.close();
                       lines++;
                       }
                       catch (IOException e){
                           
                       }
                       String idk=rs.getString(1);
                       while(idk.length()<kxd){
                           idk=idk+" ";
                       }
                       int cap=250;
                       Connection conn = DriverManager.getConnection(url, username, pwd);
                Statement stmtt = con.createStatement(); 
                
                String vkr="Select * from stud";
                ResultSet rsxd=stmtt.executeQuery(vkr);
                int m=0;
                while(rsxd.next()){
                    if(rsxd.getString(7).equals("1"))m++;
                }
                  if((cap-m)==0){
                    JOptionPane.showMessageDialog(null, "READING HALL FULL!!");
                    return ;
                }
                 go.setText(Integer.toString(cap-m-1));
                        String ky=rs.getString(3);
                        if(ky.length()==4){
                            ky+=" ";
                        }
                       String va=lines+"\t\t"+idk+"\t\t\t\t"+rs.getString(4)+"\t\t\t\t"+ky+"\t\t\t\t";
                       
                       String fkthisshit="00.00.00";
                         String tt = new SimpleDateFormat("HH.mm.ss").format(new java.util.Date());
                      String Q="Update stud set INN= '"+tt+"' where REG_ID LIKE '%"+s+"%'";
                      stmt.executeUpdate(Q);
                      String xd=new SimpleDateFormat("dd.MM.yy").format(new java.util.Date());
                      
                      va=va+tt+"\t\t\t\t"+fkthisshit+"\t\t\t"+xd;
                      
                      String ttt="1";
                      Q="Update stud set Status= '"+ttt+"' where REG_ID LIKE '%"+s+"%'";
                      stmt.executeUpdate(Q);
                      try(FileWriter fw = new FileWriter("mainfile.txt", true);
                     BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                        {
                         out.println(va);
                        }
                      
                      catch (IOException e) {
 
}                       inituid();
                      break;
                   }else{
                        String tt = new SimpleDateFormat("HH.mm.ss").format(new java.util.Date());
                      try {
                        BufferedReader file = new BufferedReader(new FileReader("mainfile.txt"));
                        String line;
                        StringBuffer inputBuffer = new StringBuffer();
                          String ch=rs.getString(3);int f=0;
                        while ((line=file.readLine()) != null) {
                            inputBuffer.append(line);
                            inputBuffer.append("\n");
                            
                        }
                        file.close();
                        String fk=inputBuffer.toString();
                          int maxI=0;
                          String rol="";
                          for(int i=0;i<fk.length()-9;i++){
                              rol="";
                              if(fk.charAt(i)=='E' && fk.charAt(i+1)=='N' && fk.charAt(i+2)=='T' && fk.charAt(i+3)=='C'){
                                  rol=Character.toString(fk.charAt(i+8))+Character.toString(fk.charAt(i+9))+Character.toString(fk.charAt(i+10))+Character.toString(fk.charAt(i+11));
                                   if(fk.charAt(i+12)>=48&&fk.charAt(i+12)<=57){
                                      rol+=fk.charAt(i+12);
                                  }
                                  if(rol.equals(ch)){
                                    if(i+8>maxI){
                                        maxI=i+8;
                                    }
                                  }
                              }
                              if(fk.charAt(i)=='C' && fk.charAt(i+1)=='O' && fk.charAt(i+2)=='M' && fk.charAt(i+3)=='P'){
                                  rol=Character.toString(fk.charAt(i+8))+Character.toString(fk.charAt(i+9))+Character.toString(fk.charAt(i+10))+Character.toString(fk.charAt(i+11));
                                  if(fk.charAt(i+12)>=48&&fk.charAt(i+12)<=57){
                                      rol+=fk.charAt(i+12);
                                  }
                                  if(rol.equals(ch)){
                                    if(i+8>maxI){
                                        maxI=i+8;
                                    }  
                                  }
                              }
                              if(fk.charAt(i)=='I' && fk.charAt(i+1)=='T'){
                                  rol=Character.toString(fk.charAt(i+6))+Character.toString(fk.charAt(i+7))+Character.toString(fk.charAt(i+8))+Character.toString(fk.charAt(i+9));
                                   if(fk.charAt(i+10)>=48&&fk.charAt(i+10)<=57){
                                      rol+=fk.charAt(i+10);
                                  }
                                  if(rol.equals(ch)){
                                    if(i+6>maxI){
                                        maxI=i+6;
                                    }  
                                  }
                              }
                          }
                          maxI+=21;
                          String fk_java="";
                         if(maxI<fk.length()){ fk_java=fk.substring(0,maxI)+tt;}
                         if(maxI+8<fk.length())fk_java+=fk.substring(maxI+8,fk.length());
                          FileOutputStream fileOut = new FileOutputStream("mainfile.txt");
                          fileOut.write(fk_java.getBytes());
                          fileOut.close();
                      }
                      
                       catch (IOException e){
                           
                       }
                             int cap=250;
                       Connection conn = DriverManager.getConnection(url, username, pwd);
                Statement stmtt = con.createStatement();
                
                String vkr="Select * from stud";
                ResultSet rsxd=stmtt.executeQuery(vkr);
                int m=0;
                while(rsxd.next()){
                    if(rsxd.getString(7).equals("1"))m++;
                }
                 
                 go.setText(Integer.toString(cap-m+1));
                        inituid();
                
                 enroll.setText("");
                        String Q="Update stud set OUTT= '"+tt+"' where REG_ID LIKE '%"+s+"%'";
                      stmt.executeUpdate(Q);
                      String ttt="0";
                      Q="Update stud set Status= '"+ttt+"' where REG_ID LIKE '%"+s+"%'";
                      stmt.executeUpdate(Q);
                      break;
                   }
               }
                String Query1 ="SELECT * FROM stud WHERE REG_ID LIKE '%"+s+"%'" ;
                ResultSet rs2=stmt.executeQuery(Query);
           
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enddActionPerformed
        
        try{
            
             String url = "jdbc:mysql://localhost:3306/barcode";
            String username = "root";
            String pwd = "varad11041997";
            Connection con = DriverManager.getConnection(url, username, pwd);
                Statement stmt = con.createStatement();
                String q="0";
                String qq="Update stud set Status= '"+q+"'";
                String vk="00.00.00";
                String q1="Update stud set INN= '"+vk+"'";
                String q2="Update stud set OUTT= '"+vk+"'";
                stmt.executeUpdate(q2);
                stmt.executeUpdate(q1);
                stmt.executeUpdate(qq);
            BufferedReader file = new BufferedReader(new FileReader("mainfile.txt"));
            String line;
            StringBuffer inputBuffer = new StringBuffer();
            int f=0;
            while ((line=file.readLine()) != null) {
                 inputBuffer.append(line);
                 inputBuffer.append("\n");
             }
             file.close();
             String re=inputBuffer.toString();
             String yd=endt.getText();
             int aa=Integer.valueOf(yd);
             aa=aa+12;
             String xd=Integer.toString(aa);
             re=re.replaceAll("00.00.00",xd+".00.00");;
             System.out.println(re);
              String tt = new SimpleDateFormat("dd.MM.YY.HH.mm.ss").format(new java.util.Date());
              String naam=tt.charAt(0)+""+tt.charAt(1)+"."+tt.charAt(3)+tt.charAt(4)+"."+tt.charAt(6)+tt.charAt(7)+".txt";
              String saal="";
              String ch=tt.charAt(6)+""+tt.charAt(7);
              if(ch.equals("18")){
                  saal="2018";
              }
              if(ch.equals("19")){
                  saal="2019";
              }
              if(ch.equals("20")){
                  saal="2020";
              }
              if(ch.equals("21")){
                  saal="2021";
              }
              if(ch.equals("22")){
                  saal="2022";
              }
              if(ch.equals("23")){
                  saal="2023";
              }
              String mon="";
              ch=tt.charAt(3)+""+tt.charAt(4);
              if(ch.equals("01")){
                  mon="JAN";
              }
              if(ch.equals("02")){
                  mon="FEB";
              }
              if(ch.equals("03")){
                  mon="MAR";
              }
              if(ch.equals("04")){
                  mon="APRIL";
              }
              
              if(ch.equals("05")){
                  mon="MAY";
              }
              if(ch.equals("06")){
                  mon="JUN";
              }
              if(ch.equals("07")){
                  mon="JUL";
              }
              if(ch.equals("08")){
                  mon="AUG";
              }
              
              if(ch.equals("09")){
                  mon="SEPT";
              }
              if(ch.equals("10")){
                  mon="OCT";
              }
              if(ch.equals("11")){
                  mon="NOV";
              }
              if(ch.equals("12")){
                  mon="DEC";
              }
              try(FileWriter fw = new FileWriter("D:\\ENTC\\DATA\\"+saal+"\\"+mon+"\\"+naam);
                     BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                        {
                         out.println(re);
} catch (IOException e) {

}              String ss="";
              try(FileWriter fw = new FileWriter("mainfile.txt");
                     BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                        {
                         out.print(ss);
                         
}        
              
              catch (IOException e) {

}              
        System.exit(0);
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }//GEN-LAST:event_enddActionPerformed

    private void enrollKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrollKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton1.doClick();
        }
    }//GEN-LAST:event_enrollKeyPressed

    private void enrollFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enrollFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_enrollFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                    JPasswordField pf = new JPasswordField();
                    int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                     enroll.setText("");
                    if (okCxl == JOptionPane.OK_OPTION) {
                        String password = new String(pf.getPassword());
                        if(!(password.equals("vg_kill"))){
                            JOptionPane.showMessageDialog(null, "ACCESS DENIED!!!");
                            return ;
                        }else{
                            String name = JOptionPane.showInputDialog("Enter end time(12-Hr Clock): ");
                            endt.setText(name);
                        }
                      }
                     try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (Exception ex) {

            }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
                
            }
           
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endd;
    private javax.swing.JTextField endt;
    private javax.swing.JTextField enroll;
    private javax.swing.JTextField go;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
