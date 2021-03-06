package chat;

import java.awt.event.ActionListener;
import java.util.ArrayList;



/**
 * class ClientGUI represents the client gui design
 * @param client - a Client object.
 * @param connected - a boolean type of variable to check if the client is connected. 
 * @param port - a defined port.
 */

public class ClientGUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private static final int port = 7777;
    private static String user_dest = "";

    private boolean connected;
	private Client client;
	private String defaultHost;
        
    
   
    
    /**
     * Constructor - Creates new form ClientGUI
     * @param host - the ip of the host
     */
    public ClientGUI(String host) {
        initComponents();
       
        ServerIpTextField.setText("localhost");
        msgTextField.setText("User");
        defaultHost = host;
        user_destTextField.setEnabled(false);
        pvtMsgCheckBox.setEnabled(false);
        LogoutBtn.setEnabled(false);
        sendBtn.setEnabled(false);
        whoIsInBtn.setEnabled(false);
        append("Welcome to our chat application\n Please enter your NickName in the field below\n");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        chatTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        whoIsInBtn = new javax.swing.JButton();
        msgTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ServerIpTextField = new javax.swing.JTextField();
        pvtMsgCheckBox = new javax.swing.JCheckBox();
        user_destTextField = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chatTextArea.setColumns(20);
        chatTextArea.setRows(5);
        jScrollPane1.setViewportView(chatTextArea);

        jLabel1.setText("Chat Room");

        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        whoIsInBtn.setText("Who is in?");
        whoIsInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoIsInBtnActionPerformed(evt);
            }
        });

        msgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Server Ip");

        ServerIpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerIpTextFieldActionPerformed(evt);
            }
        });

        pvtMsgCheckBox.setText("Send Private Message To:");
        pvtMsgCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvtMsgCheckBoxActionPerformed(evt);
            }
        });

        user_destTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_destTextFieldActionPerformed(evt);
            }
        });

        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(msgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pvtMsgCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(user_destTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(whoIsInBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ServerIpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutBtn)
                            .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ServerIpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LoginBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoutBtn)
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pvtMsgCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_destTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(whoIsInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
      /**
     * append function sends the message to the chat text area
     * @param str - the body of a text
     */
    void append(String str) {
		chatTextArea.append(str);
		chatTextArea.setCaretPosition(chatTextArea.getText().length() - 1);
	}
    
    
    /**
     * connectionFailed function handles the client gui buttons and text areas.
     */
    void connectionFailed() {
		LoginBtn.setEnabled(true);
		LogoutBtn.setEnabled(false);
		whoIsInBtn.setEnabled(false);
                user_destTextField.setEnabled(false);
                pvtMsgCheckBox.setEnabled(false);
                sendBtn.setEnabled(false);
                whoIsInBtn.setEnabled(false);
		//label.setText("Enter your username below");
		msgTextField.setText("User");
		// reset port number and host name as a construction time
		ServerIpTextField.setText(defaultHost);
		// let the user change them
		ServerIpTextField.setEditable(true);
                
		
		msgTextField.removeActionListener((ActionListener) this);
		connected = false;
	}
    
   
    
    
    
    
    private void msgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTextFieldActionPerformed
        String msg = msgTextField.getText().trim(); 
        Message message;
        if (pvtMsgCheckBox.isSelected()){
            message = new Message(Message.PVT_MESSAGE,"$"+user_destTextField.getText().trim()+"$"+msg);
            
        }
        else{
            message = new Message(1,msg);
        }
              
       msgTextField.setText("");
       
       if(msg.length() == 0) return; // there was no message!
       client.sendMessage(message);
       
    }//GEN-LAST:event_msgTextFieldActionPerformed

    private void ServerIpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerIpTextFieldActionPerformed
        
    }//GEN-LAST:event_ServerIpTextFieldActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
       client.sendMessage(new Message(Message.LOGOUT, ""));
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void whoIsInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoIsInBtnActionPerformed
    client.sendMessage(new Message(Message.WHOISIN, ""));	    }//GEN-LAST:event_whoIsInBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        
       String username = msgTextField.getText().trim(); 
       if(username.length() == 0) return;
        
     
                        
			// empty serverAddress ignore it
			String server_ip = ServerIpTextField.getText().trim();
                        append("The IP "+ server_ip + "was entered succesfully!\n");

			if(server_ip.length() == 0)
				return;
		

			// try creating a new Client with GUI
			client = new Client(server_ip,port, username, this);
                        
             
			// test if we can start the Client
			if(!client.start()) return;
                        
			msgTextField.setText("");
			connected = true;
			
			// disable login buttonchat
			LoginBtn.setEnabled(false);
			// enable the 2 buttons
			LogoutBtn.setEnabled(true);
			whoIsInBtn.setEnabled(true);
			// disable the Server and Port JTextField
			ServerIpTextField.setEditable(false);
                        // enable private message CheckBox
			pvtMsgCheckBox.setEnabled(true);
                        sendBtn.setEnabled(true);
                        whoIsInBtn.setEnabled(true);
			// Action listener for when the user enter a message
			msgTextField.addActionListener((ActionListener) this);
       
    }//GEN-LAST:event_LoginBtnActionPerformed

    
    
    
    private void pvtMsgCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvtMsgCheckBoxActionPerformed
        if(pvtMsgCheckBox.isSelected()){
            user_destTextField.setEnabled(true);
        }
        else{
            user_destTextField.setText("");
            user_destTextField.setEnabled(false);
        }
        
    }//GEN-LAST:event_pvtMsgCheckBoxActionPerformed

    private void user_destTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_destTextFieldActionPerformed
        user_destTextField.setText("");        
        
    }//GEN-LAST:event_user_destTextFieldActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        String msg = msgTextField.getText().trim(); 
        Message message;
        if (pvtMsgCheckBox.isSelected()){
            message = new Message(Message.PVT_MESSAGE,"$"+user_destTextField.getText().trim()+"$"+msg);
            
        }
        else{
            message = new Message(1,msg);
        }
              
       msgTextField.setText("");
       
       if(msg.length() == 0) return; // there was no message!
       client.sendMessage(message);
    }//GEN-LAST:event_sendBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
      new ClientGUI("localhost");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI("localhost").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JTextField ServerIpTextField;
    private javax.swing.JTextArea chatTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField msgTextField;
    private javax.swing.JCheckBox pvtMsgCheckBox;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextField user_destTextField;
    private javax.swing.JButton whoIsInBtn;
    // End of variables declaration//GEN-END:variables
}
