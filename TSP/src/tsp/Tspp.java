package tsp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;






/**
 *
 * @author GERMÁN ÁBRIGO VALENZUELA
 */
public class Tspp extends javax.swing.JFrame {

    public Tspp() {
        initComponents();
        /*Código para inhabilitar botón de generarr permutación y combobox de opciones*/
        JBPermutacion.setEnabled(false);
        Psize.setEnabled(false);
        Pcross.setEnabled(false);
        Pmut.setEnabled(false);
        tmax.setEnabled(false);
        k.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p3 = new javax.swing.JLabel();
        JBCargar = new javax.swing.JButton();
        JBPermutacion = new javax.swing.JButton();
        Tpob = new javax.swing.JLabel();
        Ccosto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Psize = new javax.swing.JComboBox<>();
        Pcruz = new javax.swing.JLabel();
        Pcross = new javax.swing.JComboBox<>();
        ProMut = new javax.swing.JLabel();
        ProMut1 = new javax.swing.JLabel();
        ProMut2 = new javax.swing.JLabel();
        Pmut = new javax.swing.JComboBox<>();
        tmax = new javax.swing.JComboBox<>();
        k = new javax.swing.JComboBox<>();
        Mensaje = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();

        p3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p3.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(100, 100));

        JBCargar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBCargar.setText("Abrir archivo...");
        JBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCargarActionPerformed(evt);
            }
        });

        JBPermutacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBPermutacion.setText("Generar Óptimo con Algoritmo Genético");
        JBPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPermutacionActionPerformed(evt);
            }
        });

        Tpob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tpob.setText("Tamaño de población             ");

        Ccosto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ccosto.setText("US$ - .");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Costo de solución óptima:");

        Psize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50", "75", "100", "125", "150", "175", "200" }));
        Psize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsizeActionPerformed(evt);
            }
        });

        Pcruz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pcruz.setText("Probabilidad de cruzamiento");

        Pcross.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.95", "0.9", "0.85", "0.8", "0.75", "0.7", "0.65", "0.6", "0.55", "0.5", "0.45", "0.4", "0.35", "0.3", "0.25", "0.2", "0.15", "0.1", "0.05" }));
        Pcross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcrossActionPerformed(evt);
            }
        });

        ProMut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProMut.setText("Probabilidad de mutación");

        ProMut1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProMut1.setText("Número máximo de iteraciones");

        ProMut2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProMut2.setText("Tamaño del torneo");

        Pmut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.95", "0.9", "0.85", "0.8", "0.75", "0.7", "0.65", "0.6", "0.55", "0.5", "0.45", "0.4", "0.35", "0.3", "0.25", "0.2", "0.15", "0.1", "0.05" }));
        Pmut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmutActionPerformed(evt);
            }
        });

        tmax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50", "100", "500", "1000", "5000", "10000", "50000", "100000" }));
        tmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmaxActionPerformed(evt);
            }
        });

        k.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6" }));
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        p.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p.setText(":");

        p1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p1.setText(":");

        p2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p2.setText(":");

        p4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p4.setText(":");

        p5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p5.setText(":");

        JPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Tpob, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ProMut2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Pcruz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ProMut, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(ProMut1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tmax, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Pmut, 0, 84, Short.MAX_VALUE)
                                            .addComponent(Pcross, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(Psize, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(JBCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JBPermutacion, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(Ccosto, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tpob, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Psize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProMut2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pcruz, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pcross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProMut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pmut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ProMut1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(JBPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ccosto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    BufferedReader br;
    String line;
    int[][] A = null;/*Creación de matriz con distancias entre ciudades*/
    int[] C = null; /*ciudades txt*/
    int[][] X = null;/*Matriz con ciudades a torneo*/
    int[] Y = null;/*Arreglo costos ciudades a torneo*/

    /*Declaración variables de utilidad para programa*/
    int c;/*Contador filas de matriz de costo*/
    int d = 0;/*Contador ciudades para arreglo de cordenadas*/
    int dim = 0;/*Dimensión de arreglos equivalente a numero de ciudades de archivo*/
    int ban = 0;/*Contador restriccion de condición*/
    boolean i = false;/*Contador restriccion de condición para ciclo de matriz costo*/
    boolean g = false;/*Contador restriccion de condición para arreglos de cordenadas*/
    int Ppsize;
    
    int [][] SeL; /*Matriz para preselección de torneo*/
    int [][] Padres; /*Matriz de padres*/
    int [] CSeL; /*Arreglo costos de preseleccionados*/
    int [] CCSeL; /*Arreglo con costoss ordenados*/
    int K; /*Seleccionados para torneo*/
    int [] PaL; /*Arreglo para valores de K que no se repitan aleatorios*/
    int [] Child; /*Arreglo hijo*/
    int []  Mejor; /*Selección de la mejor solución*/
    int [] CMejor; /*Costo de soluciones para gráfica*/
    
    private void JBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCargarActionPerformed

        final JFileChooser fc = new JFileChooser();/*Crea constructor de apertura de archivo*/
        int returnVal = fc.showOpenDialog(this);/*this porque esta asociado a esta ventana*/
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File arch = fc.getSelectedFile();
            File archivo = new File(arch.getAbsolutePath());/*Obtención ruta de archivo*/
            try {
                br = new BufferedReader(new FileReader(archivo));/* Codigo lectura de archivo, asignación a lector*/
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tspp.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while ((line = br.readLine()) != null) {/*Ciclo lectura de lineas de archivo*/
                    StringTokenizer myTokens = new StringTokenizer(line);/*Separación de linea de archivo en palabras o Tokens*/
                    if ("EOF".equals(line)) {/*Debido a problemas de lectura en linea cuando solo es un token cuando sea EOF lo termine*/
                        break;/*codigo de corte a while*/
                    }
                    while (myTokens.hasMoreTokens()) {/*Condición que recorre todas las palabras de la linea*/
                        if (ban < 2) {/*Lo utilizo para que no tire error de tokens cuando este tiene solo dos términos y pido tres ej: "Dimension: 29"*/
                            String x = myTokens.nextToken();/*Lectura de palabra o token*/
                            if ("DIMENSION:".equals(x)) {/*Comparración de la palabra buscada con el token de linea*/
                                dim = Integer.parseInt(myTokens.nextToken());/*Conversión de palabra en numero*/
                                ban += 1;
                                break;/*Interrupciones utilizadas para que no lea mas tokens y no afecte programa, asi sale del ciclo*/
                            }
                            if ("EDGE_WEIGHT_SECTION".equals(x)) {
                                i = true;/*Binaria que inicia la creación de matriz con lo datos siguientes (Costos)*/
                                A = new int[dim][dim];/*dimensionado de matriz de acuerdo a datos de ciudades en archivo*/
                                ban += 1;
                                c = 0;
                                break;/*Interrupciones utilizadas para que no lea mas tokens y no afecte programa, asi sale del ciclo*/
                            }
                        }
                        int j = 0;
                        while (j < dim && c < dim && i == true) {/*Lectura de datos para matriz*/
                            int we = Integer.parseInt(myTokens.nextToken());
                            A[c][j] = we;/*Transformación de tokens string a entero que equivale a numeros asignando a matriz*/
                            j += 1;
                        }
                        if (j == dim) {/*Cada vez que termina una linea agrega a contador fila para rellenar matriz*/
                            c += 1;
                        }

                        if (c == dim) {
                            break;/*Para que luego de esto no haga el ingreso de inmediato al ciclo */
                        }
                    }
                }
                /*COMPROBAR DATOS EN MATRIZ DE COSTOS -- IMPRIMIR COSTO DE X CIUDAD A OTRA*/ 
                /*for (int pa = 0; pa < dim; pa++) {
                    System.out.println("Costos de ciudad " + (pa + 1) + " a las otras " + (dim - 1) + " : " + Arrays.toString(A[pa]));
                }*/
                
                /*ARREGLO DE CIUDADES PARA CREAR PERMUTACIÓN O CAMINOS DE TSP*/
                C = new int[dim];
                for (int q = 0; q < dim; q++) {/*Creación de arreglo con numeros de ciudad*/
                    C[q] = q + 1;
                }
                Mensaje.setText("Archivo cargado: Genere Algoritmo Genético");/*Actualización de mensaje en label*/
                JBPermutacion.setEnabled(true);/*Deseleccionar botón de generar permutación, una vez se abre el archivo*/
                Psize.setEnabled(true);
                Pcross.setEnabled(true);
                Pmut.setEnabled(true);
                tmax.setEnabled(true);
                k.setEnabled(true);

            } catch (FileNotFoundException ex) {/*Catch para en caso de error no muestre error*/
                Logger.getLogger(Tspp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tspp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Mensaje.setText("Ningun archivo selecionado");
            Ccosto.setText("US$.-");
            JBPermutacion.setEnabled(false);/*Para desactivar botón de permutación, cuando se abrá un archivo y se quier abrir otro y se cancele */
            Psize.setEnabled(false);
            Pcross.setEnabled(false);
            Pmut.setEnabled(false);
            tmax.setEnabled(false);
            k.setEnabled(false);
        }
    }//GEN-LAST:event_JBCargarActionPerformed

    private void JBPermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPermutacionActionPerformed
        Ccosto.setText("US$ .-");
        Mensaje.setText("");
        Mensaje.setText("Buscando óptimo...");
        Población(); /*Generación de Población y costo(Fitness)*/
        Fitness(); /*Costo individuos de población*/
        
        int it=0;
        int et;
        int ttmax=Integer.parseInt((String) tmax.getSelectedItem());
        K = Integer.parseInt((String) k.getSelectedItem()); /*Extraer valor de Combobox Kpadres*/
        System.out.println("IndividuoS a torneo: "+K);
        System.out.println("Iteraciones: "+ttmax);
        PaL = new int[K];
        CMejor= new int[ttmax];
        for(int f=0;f<K;f++){ /*Matriz con valores de K para evaluar que no se repitan los random el 0, como subíndice es una opción*/
            PaL[f]=K;
        }
        
        /*para encontrar mejor obtener un costo alto igual a la suma de todas las poblaciones*/
        int costoP=0;
        for(int ta=0;ta<Ppsize;ta++){
            costoP+=Y[ta];
        }
        System.out.println("Costo total: "+costoP);
        while(it<ttmax){
            System.out.println("### ITERACION "+(it+1)+" ###");
            System.out.println("# TORNEO "+(it+1)+" #");
            /*##TORNEO##*/ Torneo();
            System.out.println("# CROSSOVER "+(it+1)+" #");
            /*##CRUZAMIENTO##*/PMX_Crossover();
            System.out.println("# 2-OPT "+(it+1)+" #");
            /*##MUTACIÓN##*/D_Opt();
            
            /*##Seleccionar mejor##*/ 
            et=Costo(Child, A);
            if (et<costoP){
                costoP=et;
                /*Mostrar costo de mutación*/ /*System.out.println("Costo hijo: "+costoP);*/
                Mejor=Child;
                CMejor[it]=costoP;
            } else {
                CMejor[it]=et;
            }
            
            it++;           
        }
        System.out.println("########## SOLUCIÓN FINAL ########");
        System.out.println("RUTA ÓPTIMA: "+Arrays.toString(Mejor)); /*MOSTRAR Solución mejor*/
        System.out.println("COSTO RUTA ÓPTIMA: "+costoP); /*MOSTRAR Solución mejor*/
        System.out.println("COSTOS DE ITERACIONES: "+Arrays.toString(CMejor)); /*MOSTRAR Solución mejor*/
        
        /*Datos de gráfico*/
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int da=0; da<ttmax;da++){
            String str = Integer.toString(da);
            dataset.addValue(CMejor[da], "Costo" ,str);
        }
        /*GENERACIÓN DE GRÁFICO*/
        JFreeChart chart=ChartFactory.createLineChart("Evolución de costos de solución","Iteración","Costo",dataset,PlotOrientation.VERTICAL,false,true,false);
        chart.setBackgroundPaint(Color.WHITE); /*FONDO BLANCO*/
        ChartPanel chartPanel = new ChartPanel(chart);
        /*PONER GRÁFICO EN PANEL*/
        JPanel.setLayout(new java.awt.BorderLayout());
        JPanel.add(chartPanel,BorderLayout.CENTER);
        JPanel.validate();
        
        /*Colocar monto del costo en dollares*/
        Locale locale = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale); /*Formato en función a la region*/
        /*System.out.println("Costo total : "+nf.format(cost));*/
        Mensaje.setText("");
        Ccosto.setText("US"+nf.format(costoP)+".-");
        Mensaje.setText("¡OPTIMO GENERADO!... ");/*Actualización de mensaje en label*/
    }//GEN-LAST:event_JBPermutacionActionPerformed

    private void Torneo() {
        /*Extracción de los k padres a torneo*/
        /*padres aleatorios*/
        int t=0;
            PaL[0]=(int) (Math.random() * Ppsize);
            while(t<K){
                int alt = (int) (Math.random() * Ppsize);
                int bn=0;
                for(int s=0;s<t;s++){ /*Para no repetir los seleccionados en torneo*/
                    if(PaL[s]==alt){
                        bn=1;
                    }
                }
                if(bn==0){
                    PaL[t]=alt;
                    t++;
                }
            }
            /*EXTRACCIÓN DE SELECCIONADOS DE POBLACIÓN PARA TORNEO*/
            SeL = new int[K][dim];
            Padres = new int[2][dim];
            CSeL = new int[K];
            CCSeL = new int[K]; /*Arreglo con costoss ordenados*/
            for(int po=0; po<K;po++){
                SeL[po]=X[PaL[po]];
                CSeL[po]=Y[PaL[po]];
                /*System.out.println(Arrays.toString(SeL[po])); MOSTRAR SELECCIOADOS*/
            }
            System.arraycopy(CSeL, 0, CCSeL, 0,K);/*Copiar arreglo para order los de torneo de menor a mayor */
            int aux;
            for(int h = 0; h < K; h++){ /*ORDENAR DE MENOR A MAYOR ARREGLO COSTOS*/
                for(int j=h+1; j < K; j++){
                    if(CCSeL[h] > CCSeL[j]){
			aux = CCSeL[h];
			CCSeL[h] = CCSeL[j];
			CCSeL[j] = aux;
                    }
		}
            }
            /*System.out.println(Arrays.toString(CSeL)); MOSTRAR ARREGLO COSTOS SEGUN SELECCIÓN*/
            /*System.out.println(Arrays.toString(CCSeL)); MOSTRAR ARREGLO COSTOS ORDENADOS*/
            
            /*Selección de Padres de acuerdo a orden de torneo*/
            for(int ar=0;ar<K;ar++){
                if(CCSeL[0]==CSeL[ar]){
                    Padres[0]=SeL[ar];
                }
                if(CCSeL[1]==CSeL[ar]){
                    Padres[1]=SeL[ar];
                }
            }
            System.out.println("Padre 1: "+Arrays.toString(Padres[0])); /*MOSTRAR PADRE 1 MENOR*/
            System.out.println("Padre 2: "+Arrays.toString(Padres[1])); /*MOSTRAR PADRE 2 MENOR*/
    }
    private void Población(){
        /*Extrae valor de Combobox POBLACION*/
        Ppsize=Integer.parseInt((String) Psize.getSelectedItem());
        System.out.println("Población de "+Ppsize+" individuos"); /*Mostrar tamaño de población*/
        X = new int[Ppsize][dim];
        int fe=0;
        while(fe<Ppsize) {/*Algoritmo de Fisher-Yates para generar permutación TSP*/
            int L = C.length;
            for (int w = 0; w < L; w++) {
                int m = (int) (w + Math.random() * (L - w));
                int r = C[m];
                C[m] = C[w];
                C[w] = r;
            }
            
            /*Permutación generada*/
            System.arraycopy(C, 0, X[fe], 0, dim); /*Copia arreglo C en matriz X en cada indice*/
            /* System.out.println(Arrays.toString(X[fe])); MOSTRAR INDIVIDUOS DE POBLACIÓN*/
            
            fe=fe+1;
        }
    }
    private void Fitness(){
        Y = new int[Ppsize];
        /*CALCULO DE COSTO DE PERMUTACIÓN*/
        for(int ge=0;ge<Ppsize;ge++){
            int cost = 0;
            for (int y = 0; y < dim; y++) {
                if (y == (dim - 1)) {/*Para último término volver al principio*/
                    cost += A[X[ge][y] - 1][X[ge][0] - 1];/*Se resta uno ya que lista parte de 0 por tanto la ciudad 29 en arreglo es indice 28*/
                } else {/*Todos caminos intermedios*/
                    cost += A[X[ge][y] - 1][X[ge][y + 1] - 1];
                }
            }
            Y[ge] = cost;/*Costo de permutación creada*/
            /* System.out.println(cost); MOSTRAR COSTOS DE POBLACIÓN*/
        }
    }
    private void PMX_Crossover(){
        Child= new int[dim]; /*Arreglo hijo*/
        double probcross = (double) Math.random();
        double Ppcross= Double.parseDouble(Pcross.getSelectedItem().toString());
        if(Ppcross>probcross){
            System.out.println("Crossover por PMX");
            /*Determinar rango de copia de padre*/
            int r1 = (int) (Math.random() * dim);
            int r2 = (int) (Math.random() * dim);
            while(Math.abs(r1-r2)<5){ /*se define un rango mayor a 5 para evitar numeros consecutivos, ademas de iguales*/
                r1 = (int) (Math.random() * (dim-1));
                r2 = (int) (Math.random() * (dim-1));
            }
            /*Ordenar los 2 random de menor a mayor */
            int aux1;
            if(r1>r2){ 
                aux1=r1;
                r1=r2;
                r2=aux1;
            }

            /* System.out.println("Valores entre posición arreglo: "+r1+" y "+r2); MOSTRAR RANGO DE SWATH*/

            /*Copiar rango de padre 1 por random en hijo*/
            for(int ya=0;ya<dim;ya++){ 
                if(ya>=r1 && ya<=r2){
                    Child[ya]=Padres[0][ya];
                }
            }
            /*ALGORITMO PMX*/
            for(int ye=r1;ye<=r2;ye++){
                int bdera=1;
                for(int yi=0;yi<dim;yi++){ /*DETERMINAR si primer término en rango seleccionado, esta en rango copiado de padre 1*/
                    if(Child[yi]!=Padres[1][ye]){   
                        bdera=0;
                    } else {
                        bdera=1;
                        break;
                    }
                }
                if (bdera==0){ /*Si no está realiza busqueda para agregarlo en hijo en cierta posición */
                    int wa=1; /*Bandera para que busque donde agregarlo hasta que encuentre espacio*/
                    int ap=ye; /*Ir buscando valor de padre 1 en padre 2*/
                    while(wa==1){
                        for(int yo=0;yo<dim;yo++){
                            if(Padres[0][ap]==Padres[1][yo]){
                                if(yo>=r1 && yo<=r2){ /*Si valor sigue en rango vuelvo a buscar el valor en misma posición de padre 1 en el 2*/
                                    wa=1;
                                    ap=yo; /*actualizo auxiliar*/
                                } else{ /*Si esta fuera del rango agrego el valor */
                                    Child[yo]=Padres[1][ye];
                                    wa=0;
                                }
                            }
                        }
                    }
                }
            }
            /*Copiar aquello no cruzado en hijo, es decir bajar valores de padre 2*/
            /*System.out.println("Hijo luego de cruzamiento: "+Arrays.toString(Child) ANTES DE COPIA DE PADRE );*/
            for(int la=0;la<dim;la++){
                if(Child[la]==0){
                    Child[la]=Padres[1][la];
                }
            }
        } else {
            System.out.println("Crossover por genética del padre");
            /*En caso de que no se lleve a cabo cruzamiento el hijo toma genetica del padre*/
            Child=Padres[0];
        }
        System.out.println("Hijo: "+Arrays.toString(Child));
    }
    private void D_Opt(){
        double probmut = (double) Math.random();
        double Ppmut= Double.parseDouble(Pmut.getSelectedItem().toString());
        if(Ppmut>probmut){
            System.out.println("Mutación por 2-OPT");
            /*Determinar indices para extraer parejas*/
            int m1 = (int) (Math.random() * (dim-2)); /*dim-2 ya que el indice es hasta dim-1 y desarrollo considera pareja es decir random+1 para que no salga fuera de rango de arreglo*/
            int m2 = (int) (Math.random() * (dim-2));  

            /*Mostrar randoms*/ 
            /*System.out.println("Randoms : "+m1+" y "+m2);*/

            /*repetición para asegurar que no tome mismos valores de pareja es decir 13-14 y 14-15*/
            while (Math.abs(m1-m2)<3){ 
                m1 = (int) (Math.random() * (dim-2));
                m2 = (int) (Math.random() * (dim-2)); 
            }
            /*Mostrar randoms finales*/ 
            /*System.out.println("Randoms final : "+m1+" y "+m2);*/

            /*Obtener parejas de ciudades del areglo*/
            int G=Child[m1];
            int E=Child[m1+1];
            int R=Child[m2];
            int M=Child[m2+1];

            /*Mostrar ruta seleccionada antes de evaluación */
            /*System.out.println("Rutas seleccionadas: "+(G)+" y "+(E)+" junto con "+(R)+" y "+(M));*/


            /*Obtención costo*/
            int cost1= A[G-1][E-1]+A[R-1][M-1]; /*Original*/
            int cost2= A[G-1][M-1]+A[R-1][E-1]; /*Mutado*/

            /*Mostrar costo previo original antes de evaluación*/ 
            /*System.out.println("Costo original : "+cost1);*/
            /*Mostrar costo previo mutado antes de evaluación*/ 
            /*System.out.println("Costo mutación : "+cost2);*/

            /*Evaluacción*/ /*Que mutación siempre mejore original*/
            while(cost1<cost2){ 
                /*Se repite proces anterior*/
                m1 = (int) (Math.random() * (dim-2));
                m2 = (int) (Math.random() * (dim-2)); 
                while (Math.abs(m1-m2)<3){
                    m1 = (int) (Math.random() * (dim-2));
                    m2 = (int) (Math.random() * (dim-2)); 
                }
                G=Child[m1];
                E=Child[m1+1];
                R=Child[m2];
                M=Child[m2+1];
                cost1= A[G-1][E-1]+A[R-1][M-1];
                cost2= A[G-1][M-1]+A[R-1][E-1];
            }
            System.out.println("Rutas seleccionadas: "+(G)+" y "+(E)+" junto con "+(R)+" y "+(M));
            /* Mostrar costo de ruta original*/ /*System.out.println("Costo original : "+cost1);*/
            System.out.println("Mutación: "+(G)+" y "+(M)+" junto con "+(R)+" y "+(E));
            /* Mostrar costo de mutación */ /*System.out.println("Costo mutación: "+cost2);*/

            /*Modificación hijo de acuerdo a Mutación*/
            int auxi;
            auxi=Child[m2+1];
            Child[m2+1]=Child[m1+1];
            Child[m1+1]=auxi;
            System.out.println("Hijo Mutado: "+Arrays.toString(Child)); /*MOSTRAR HIJO MUTADO*/
        } else{
            System.out.println("Por probabilidad no se lleva a cabo mutación 2-OPT");
            System.out.println("Hijo sin mutación: "+Arrays.toString(Child)); /*MOSTRAR SIN MUTACIÓN*/
        }
    } 
    public static int Costo(int [] arg1, int[][] arg2){
        int cost=0;
        for (int y = 0; y < arg1.length; y++) {
            if (y == (arg1.length - 1)) {/*Para último término volver al principio*/
                cost += arg2[arg1[y]-1][arg1[0]-1];/*Se resta uno ya que lista parte de 0 por tanto la ciudad 29 en arreglo es indice 28*/
            } else {/*Todos caminos intermedios*/
                cost +=arg2[arg1[y]-1][arg1[y+1]-1];
            }
        }
        return cost;/*Costo de permutación creada*/
        /* System.out.println(cost); MOSTRAR COSTOS DE POBLACIÓN*/
    }
    
    private void PsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsizeActionPerformed
    private void tmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmaxActionPerformed
    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kActionPerformed
    private void PmutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmutActionPerformed

    }//GEN-LAST:event_PmutActionPerformed

    private void PcrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcrossActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_PcrossActionPerformed
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Tspp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ccosto;
    private javax.swing.JButton JBCargar;
    private javax.swing.JButton JBPermutacion;
    private javax.swing.JPanel JPanel;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JComboBox<String> Pcross;
    private javax.swing.JLabel Pcruz;
    private javax.swing.JComboBox<String> Pmut;
    private javax.swing.JLabel ProMut;
    private javax.swing.JLabel ProMut1;
    private javax.swing.JLabel ProMut2;
    private javax.swing.JComboBox<String> Psize;
    private javax.swing.JLabel Tpob;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> k;
    private javax.swing.JLabel p;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JComboBox<String> tmax;
    // End of variables declaration//GEN-END:variables
}

