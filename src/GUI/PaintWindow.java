package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class PaintWindow extends javax.swing.JFrame {

    public PaintWindow() {
        initComponents();
        myBoard.temp = new ArrayList<>();
        myBoard.delTemp = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myBoard = new GUI.Board();
        lineButton = new javax.swing.JButton();
        rectButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        triangleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        red = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        pink = new javax.swing.JButton();
        lightGreen = new javax.swing.JButton();
        green = new javax.swing.JButton();
        cyan = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        violet = new javax.swing.JButton();
        black = new javax.swing.JButton();
        grey = new javax.swing.JButton();
        brown = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        fillCheckBox = new javax.swing.JCheckBox();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myBoard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout myBoardLayout = new javax.swing.GroupLayout(myBoard);
        myBoard.setLayout(myBoardLayout);
        myBoardLayout.setHorizontalGroup(
            myBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        myBoardLayout.setVerticalGroup(
            myBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        lineButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        lineButton.setText("line");
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        rectButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        rectButton.setText("Rectangle");
        rectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectButtonActionPerformed(evt);
            }
        });

        circleButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        circleButton.setText("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        triangleButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        triangleButton.setText("Triangle");
        triangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleButtonActionPerformed(evt);
            }
        });

        squareButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        squareButton.setText("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        red.setBackground(new java.awt.Color(255, 51, 51));
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });

        yellow.setBackground(new java.awt.Color(255, 255, 102));
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });

        pink.setBackground(new java.awt.Color(255, 102, 204));
        pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkActionPerformed(evt);
            }
        });

        lightGreen.setBackground(new java.awt.Color(51, 255, 51));
        lightGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightGreenActionPerformed(evt);
            }
        });

        green.setBackground(new java.awt.Color(0, 153, 51));
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });

        cyan.setBackground(new java.awt.Color(153, 255, 255));
        cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanActionPerformed(evt);
            }
        });

        blue.setBackground(new java.awt.Color(0, 51, 255));
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });

        violet.setBackground(new java.awt.Color(153, 0, 153));
        violet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                violetActionPerformed(evt);
            }
        });

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        grey.setBackground(new java.awt.Color(153, 153, 153));
        grey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyActionPerformed(evt);
            }
        });

        brown.setBackground(new java.awt.Color(153, 102, 0));
        brown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownActionPerformed(evt);
            }
        });

        orange.setBackground(new java.awt.Color(255, 204, 0));
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });

        fillCheckBox.setText("Fill the Shape");
        fillCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillCheckBoxActionPerformed(evt);
            }
        });

        undo.setFont(new java.awt.Font("Work Sans", 3, 10)); // NOI18N
        undo.setText("UNDO");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setFont(new java.awt.Font("Work Sans", 3, 10)); // NOI18N
        redo.setText("REDO");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Work Sans", 3, 10)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(redo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brown, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grey, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(violet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lightGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pink, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fillCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(triangleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(circleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(squareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(myBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(circleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(triangleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fillCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(myBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(red, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yellow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lightGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cyan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(violet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(black, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {circleButton, lineButton, rectButton, squareButton, triangleButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        myBoard.mode = 0;
    }//GEN-LAST:event_lineButtonActionPerformed
    private void rectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtonActionPerformed
        myBoard.mode = 1;
    }//GEN-LAST:event_rectButtonActionPerformed
    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        myBoard.mode = 2;
    }//GEN-LAST:event_circleButtonActionPerformed
    private void triangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleButtonActionPerformed
        myBoard.mode = 3;
    }//GEN-LAST:event_triangleButtonActionPerformed
    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        myBoard.mode = 4;
    }//GEN-LAST:event_squareButtonActionPerformed
    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        myBoard.setCurrentcolor(Color.red);
    }//GEN-LAST:event_redActionPerformed
    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        myBoard.setCurrentcolor(Color.yellow);
    }//GEN-LAST:event_yellowActionPerformed
    private void pinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkActionPerformed
        myBoard.setCurrentcolor(Color.pink);
    }//GEN-LAST:event_pinkActionPerformed
    private void lightGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightGreenActionPerformed
        Color c = new Color(51, 255, 51);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_lightGreenActionPerformed
    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        myBoard.setCurrentcolor(Color.green);
    }//GEN-LAST:event_greenActionPerformed
    private void cyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanActionPerformed
        myBoard.setCurrentcolor(Color.cyan);
    }//GEN-LAST:event_cyanActionPerformed
    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        myBoard.setCurrentcolor(Color.blue);
    }//GEN-LAST:event_blueActionPerformed
    private void violetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_violetActionPerformed
        Color c = new Color(153, 0, 153);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_violetActionPerformed
    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        myBoard.setCurrentcolor(Color.black);
    }//GEN-LAST:event_blackActionPerformed
    private void greyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyActionPerformed
        Color c = new Color(153, 153, 153);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_greyActionPerformed
    private void brownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brownActionPerformed
        Color c = new Color(153, 102, 0);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_brownActionPerformed
    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
        myBoard.setCurrentcolor(Color.orange);
    }//GEN-LAST:event_orangeActionPerformed
    private void fillCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillCheckBoxActionPerformed
        if (fillCheckBox.isSelected()) {
            myBoard.setFill(true);
        } else {
            myBoard.setFill(false);
        }
    }//GEN-LAST:event_fillCheckBoxActionPerformed
    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
       
        if (myBoard.shapes.size() - 1 >= 0) {
            myBoard.temp.add(myBoard.shapes.get(myBoard.shapes.size() - 1));
            myBoard.shapes.remove(myBoard.shapes.size() - 1);
            repaint();
        }
    }//GEN-LAST:event_undoActionPerformed
    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        if (myBoard.temp.size() - 1 >= 0) {
            if (!myBoard.temp.isEmpty()) {
                myBoard.shapes.add(myBoard.temp.get(myBoard.temp.size() - 1));
                myBoard.temp.remove(myBoard.temp.size() - 1);
                repaint();
            }
        }
    }//GEN-LAST:event_redoActionPerformed
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Collections.reverse(myBoard.shapes);
        myBoard.temp.addAll(myBoard.shapes);
        myBoard.shapes.clear();
        
        repaint();
    }//GEN-LAST:event_ClearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"Click on an a clear area of the figure you'd like to delete!");
        myBoard.mode = 5;
    }//GEN-LAST:event_deleteActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PaintWindow().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton black;
    private javax.swing.JButton blue;
    private javax.swing.JButton brown;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton cyan;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox fillCheckBox;
    private javax.swing.JButton green;
    private javax.swing.JButton grey;
    private javax.swing.JButton lightGreen;
    private javax.swing.JButton lineButton;
    private GUI.Board myBoard;
    private javax.swing.JButton orange;
    private javax.swing.JButton pink;
    private javax.swing.JButton rectButton;
    private javax.swing.JButton red;
    private javax.swing.JButton redo;
    private javax.swing.JButton squareButton;
    private javax.swing.JButton triangleButton;
    private javax.swing.JButton undo;
    private javax.swing.JButton violet;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables
}
