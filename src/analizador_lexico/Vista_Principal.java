package analizador_lexico;
import java.util.ArrayList;

public class Vista_Principal extends javax.swing.JFrame {
    ArrayList<Token> lista_token = new ArrayList (); 

    public Vista_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_editor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_consola = new javax.swing.JTextArea();
        txt_analizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_editor.setColumns(20);
        txt_editor.setRows(5);
        jScrollPane1.setViewportView(txt_editor);

        txt_consola.setColumns(20);
        txt_consola.setRows(5);
        jScrollPane2.setViewportView(txt_consola);

        txt_analizar.setText("ANALIZAR");
        txt_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_analizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(54, 54, 54)
                .addComponent(txt_analizar)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(txt_analizar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_analizarActionPerformed

        new Analizador(lista_token).analizar(txt_editor.getText());
        
        for (int i = 0; i < lista_token.size(); i++) {
            txt_consola.setText(txt_consola + "\n" + lista_token.get(i).toString());
            
        }
    }//GEN-LAST:event_txt_analizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton txt_analizar;
    private javax.swing.JTextArea txt_consola;
    private javax.swing.JTextArea txt_editor;
    // End of variables declaration//GEN-END:variables
}
