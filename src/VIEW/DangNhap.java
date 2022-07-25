/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import DAO.ConnectSQL;
import DTO.NhanVien;
import SERVICE.NhanVienSERVICE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class DangNhap extends javax.swing.JFrame {
    /**
     * Creates new form DangNhap
     */
    
    public Connection conn = ConnectSQL.getConnection();
    private PreparedStatement pst = null;  
    private ResultSet rs = null;
    
    NhanVienSERVICE nhanVienSERVICE;
    NhanVien nhanVien;
    public DangNhap() {
        initComponents();
        nhanVienSERVICE = new NhanVienSERVICE();
        nhanVien = new NhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfTaiKhoan = new javax.swing.JTextField();
        btnAnMK = new javax.swing.JLabel();
        btnHienMK = new javax.swing.JLabel();
        tfMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        tfTenHienThi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/373x478.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 139, 130));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 69, 328, 54));

        tfTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaiKhoanActionPerformed(evt);
            }
        });
        jPanel3.add(tfTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 163, 280, -1));

        btnAnMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAnMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eye_16px.png"))); // NOI18N
        btnAnMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnMKMouseClicked(evt);
            }
        });
        jPanel3.add(btnAnMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 30, 30));

        btnHienMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHienMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/blind_16px.png"))); // NOI18N
        btnHienMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHienMKMouseClicked(evt);
            }
        });
        jPanel3.add(btnHienMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 30, 30));

        tfMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfMatKhau.setFocusAccelerator('\u0001');
        tfMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatKhauActionPerformed(evt);
            }
        });
        jPanel3.add(tfMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 240, 280, -1));

        btnDangNhap.setBackground(new java.awt.Color(49, 139, 130));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseClicked(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel3.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 331, -1, 46));

        btnThoat.setBackground(new java.awt.Color(49, 139, 130));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel3.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 331, 134, 46));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 139, 130));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/password_28px.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 240, 26, 29));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 139, 130));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/account_30px.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 163, -1, -1));

        lbThoat.setBackground(new java.awt.Color(49, 139, 130));
        lbThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Close_18px.png"))); // NOI18N
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatMouseClicked(evt);
            }
        });
        jPanel3.add(lbThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 6, 26, 32));

        tfTenHienThi.setForeground(new java.awt.Color(255, 255, 255));
        tfTenHienThi.setBorder(null);
        jPanel3.add(tfTenHienThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 280, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 450, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMatKhauActionPerformed

    private void btnDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseClicked

    }//GEN-LAST:event_btnDangNhapMouseClicked

    private boolean CheckNull(){
        boolean kq=true;
        if(this.tfTaiKhoan.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên đăng nhập!");
            return false;
        }
        if(String.valueOf(this.tfMatKhau.getPassword()).length()==0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập mật khẩu!");
            return false;
        }
        return kq;
    }
    
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String sql = "SELECT * FROM TaiKhoan WHERE tenDangNhap=? and matKhau=?";
        if(CheckNull())
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, this.tfTaiKhoan.getText());
            pst.setString(2, String.valueOf(this.tfMatKhau.getPassword()));
            rs=pst.executeQuery();
            if(rs.next()){
                //Detail detail=new Detail(rs.getString("tenDangNhap").trim(),rs.getString("tenHienThi").trim());
                if(rs.getString("tenDangNhap").trim().equals("Admin")){
                    String a = tfTenHienThi.getText();
                    QuanLy home =new QuanLy();
                    home.tfTenDangNhapNV.setText(a);
                    home.cbTenNV.addItem(a);
                    this.setVisible(false);
                    home.setVisible(true);
                }
                else{
                    String a = tfTenHienThi.getText();
                    NhanVienfr nhanVienQL=new NhanVienfr();
                    nhanVienQL.tfTenDangNhapNV.setText(a);
                    nhanVienQL.cbTenNV.addItem(a);
                    this.setVisible(false);
                    nhanVienQL.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Bạn đã nhập sai tên đăng nhập hoặc mật khẩu!");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        int click=JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình hay không?", "Thông báo", 2);
        if(click==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThoatMouseClicked
        int click=JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình hay không?", "Thông báo", 2);
        if(click==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_lbThoatMouseClicked

    private void btnAnMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnMKMouseClicked
        btnAnMK.setVisible(false);
        btnHienMK.setVisible(true);
        tfMatKhau.setEchoChar((char)0);        
    }//GEN-LAST:event_btnAnMKMouseClicked

    private void btnHienMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienMKMouseClicked
        btnAnMK.setVisible(true);
        btnHienMK.setVisible(false);
        tfMatKhau.setEchoChar('*');
    }//GEN-LAST:event_btnHienMKMouseClicked

    private void tfTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaiKhoanActionPerformed
        String sql = "SELECT nv.tenNV FROM NhanVien nv, TaiKhoan tk WHERE tk.tenDangNhap = nv.tenDangNhap and tk.tenDangNhap = ?";
        try{
            String tenDangNhap = (String) tfTaiKhoan.getText();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, tenDangNhap);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                tfTenHienThi.setText(rs.getString("tenNV"));
            }
        } catch(Exception e){
                JOptionPane.showMessageDialog(this, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfTaiKhoanActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAnMK;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel btnHienMK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JPasswordField tfMatKhau;
    private javax.swing.JTextField tfTaiKhoan;
    private javax.swing.JTextField tfTenHienThi;
    // End of variables declaration//GEN-END:variables

}
