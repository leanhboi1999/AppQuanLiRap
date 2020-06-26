package view;

import controller.PhimController;
import entity.Phim;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.DateFormat;

public class PhimUI extends javax.swing.JFrame {
    private String maquyen;
    
    public PhimUI(String maquyen) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("App quản lý rạp phim");
        this.maquyen = maquyen;
        try {
            ArrayList<Phim> arr = PhimController.taiTatCa();
            loadPhim(arr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private PhimUI() {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTenPhim = new javax.swing.JTextField();
        ckTenPhim = new javax.swing.JCheckBox();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        ckThoiGian = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateEndDate = new com.toedter.calendar.JDateChooser();
        dateStartDate = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePhim = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        bntxoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Tra cứu phim");

        txtTenPhim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ckTenPhim.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup1.add(ckTenPhim);
        ckTenPhim.setText("Theo tên phim");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-20.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-reset-20.png"))); // NOI18N
        btnReset.setText("Đặt lại");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        ckThoiGian.setBackground(new java.awt.Color(250, 250, 250));
        buttonGroup1.add(ckThoiGian);
        ckThoiGian.setText("Theo khoảng thời gian");

        jLabel3.setText("Từ ngày:");

        jLabel5.setText("Đến ngày:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckTenPhim)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btnSearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(ckThoiGian)
                            .addGap(117, 117, 117))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ckTenPhim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(ckThoiGian)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 112, 330, 430);

        jPanel10.setBackground(new java.awt.Color(250, 250, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-20 (1).png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-invisible-20.png"))); // NOI18N
        btnLoad.setText("Hiển thị tất cả");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jTablePhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phim", "Tên phim", "Thời lượng", "Nhà sản xuất", "Nước sản xuất", "Năm sản xuất", "Ngày khởi chiếu", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePhim.setFocusable(false);
        jTablePhim.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTablePhim.setRowHeight(25);
        jTablePhim.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTablePhim.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablePhim);
        if (jTablePhim.getColumnModel().getColumnCount() > 0) {
            jTablePhim.getColumnModel().getColumn(0).setResizable(false);
        }

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-20.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        bntxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-20.png"))); // NOI18N
        bntxoa.setText("Xóa");
        bntxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoad)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(330, 112, 842, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Dashboard.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1170, 545);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ckTenPhim.setSelected(false);
        ckThoiGian.setSelected(false);
        txtTenPhim.setText("");
        dateStartDate.setCalendar(null);
        dateEndDate.setCalendar(null);
        try {
            ArrayList<Phim> arr = PhimController.taiTatCa();
            loadPhim(arr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            dispose();
            ThemPhimUI themphim = new ThemPhimUI(true, null, maquyen);
            themphim.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    //Action hiển thị list phim
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        try {
            ArrayList<Phim> arr = PhimController.taiTatCa();
            loadPhim(arr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    //Sửa thông tin phim
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = jTablePhim.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Không click chọn có mà hiển thị bằng niềm tin", "Null Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String maphim = jTablePhim.getModel().getValueAt(row, 0).toString();
            dispose(); //Hàm này sẽ dừng hiển thị cửa sổ hiện tại
            ThemPhimUI themphim = new ThemPhimUI(false, maphim, maquyen);
            themphim.setVisible(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    //Hàm tìm kiếm
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            if (ckTenPhim.isSelected() && ckThoiGian.isSelected()) {
                JOptionPane.showMessageDialog(null, "Tham vừa thôi, tìm 1 diều kiện là được rồi");
            } else if (ckTenPhim.isSelected()) {
                String tenphim = txtTenPhim.getText();
                ArrayList<Phim> arr = PhimController.timKiem(tenphim);
                loadPhim(arr);
            } else if (ckThoiGian.isSelected()) {
                String startDate = DateFormat.toString(dateStartDate.getDate());
                String endDate = DateFormat.toString(dateEndDate.getDate());
                ArrayList<Phim> list = PhimController.timKiem(startDate, endDate);
                loadPhim(list);
            } else {
                JOptionPane.showMessageDialog(null, "Tức đó, không chọn gì đòi tìm gì hả");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void bntxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntxoaActionPerformed
        int row = jTablePhim.getSelectedRow();
        String maphim = jTablePhim.getValueAt(row, 0).toString();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Không click chọn có mà hiển thị bằng niềm tin", "Null Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa dữ liệu không?", "Delete", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                try {
                    //kq = contronllerphim.xoa(tam);
                    if (PhimController.xoaPhim(maphim)) {
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                        ArrayList<Phim> arr = PhimController.taiTatCa();
                        loadPhim(arr);
                    } else {
                        JOptionPane.showMessageDialog(null, "Xóa thất bại");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_bntxoaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        HomeUI ui = new HomeUI(maquyen);
        ui.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhimUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntxoa;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckTenPhim;
    private javax.swing.JCheckBox ckThoiGian;
    private com.toedter.calendar.JDateChooser dateEndDate;
    private com.toedter.calendar.JDateChooser dateStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePhim;
    private javax.swing.JTextField txtTenPhim;
    // End of variables declaration//GEN-END:variables

    private void loadPhim(ArrayList<Phim> arr) throws SQLException {
        DefaultTableModel table = (DefaultTableModel) jTablePhim.getModel();
        table.getDataVector().removeAllElements(); //reset dữ liệu table về rỗng
        Object row[] = new Object[8];
        for (Phim item : arr) {
            row[0] = item.getMaphim();
            row[1] = item.getTenphim();
            row[2] = item.getThoiluong();
            row[3] = item.getNhasanxuat();
            row[4] = item.getNuocsanxuat();
            row[5] = item.getNamsanxuat();
            row[6] = DateFormat.toString(item.getNgaykhoichieu());
            row[7] = item.getTrangthai();
            table.addRow(row);
        }
    }
}
