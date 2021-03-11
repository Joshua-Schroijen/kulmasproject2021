/* Generated by Together */

package gui.video;

import gui.setup.Setup;
import util.AsciiReader;
import util.Variables;
import util.event.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@SuppressWarnings("FieldCanBeLocal")
public class BatchMAS extends JFrame implements Listener {
    public static final int MAXRUNS = 100;

    public static void main(String[] arg) {
        BatchMAS prog = new BatchMAS();
        prog.init();
        prog.setVisible(true);
    }

    /**
     * Initializes the application. Calls initialize() and does some more init
     * like eventmanager and button enabling
     */
    public void init() {
        initialize();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        for (int i = 1; i <= MAXRUNS; i++) {
            nbruns.addItem("" + i);
        }
        processButton.setEnabled(true);
        abortButton.setEnabled(false);
        nbruns.setEnabled(true);
        EventManager.getInstance().addListener(this, GameOverEvent.class);
        EventManager.getInstance().addListener(this, AgentActionEvent.class);
        EventManager.getInstance().addListener(this, WorldProcessedEvent.class);
        EventManager.getInstance().addListener(this, MsgSentEvent.class);
    }

    /**
     * Creates all components
     */
    public void initialize() {
        //int labelSizeX = 34;
        int labelSizeX = 70;
        int labelSizeY = 25;
        questionLabel.setText("");
        questionLabel.setMinimumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        questionLabel.setMaximumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        questionLabel.setPreferredSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        questionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        questionLabel.setToolTipText("");
        energyLabel.setText("");
        energyLabel.setMinimumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        energyLabel.setMaximumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        energyLabel.setPreferredSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        energyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        energyLabel.setToolTipText("");
        nbPacketsLabel.setText("");
        nbPacketsLabel.setMinimumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        nbPacketsLabel.setMaximumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        nbPacketsLabel.setPreferredSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        nbPacketsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        nbPacketsLabel.setToolTipText("");
        textpane.setText("");
        textpane.setBounds(new java.awt.Rectangle(149, 74, 76, 6));
        textpane.setPreferredSize(new java.awt.Dimension(420, 6));
        textpane.setEditable(false);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new
            java.awt.Color(0, 0, 0), 1));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(420, 200));
        jScrollPane1.setBackground(new java.awt.Color(212, 208, 200));
        jScrollPane1.setSize(new java.awt.Dimension(420, 259));
        jPanel5.setBounds(new java.awt.Rectangle(3, 96, 10, 10));
        jPanel5.setLayout(new java.awt.GridBagLayout());
        jPanel5.setAlignmentX(0.5f);
        jPanel5.setAlignmentY(0.5f);
        jPanel5.add(jLabel3,
                    new java.awt.GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.CENTER,
            java.awt.GridBagConstraints.HORIZONTAL,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(jLabel4,
                    new java.awt.GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(nbruns,
                    new java.awt.GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.CENTER,
            java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(currentrun,
                    new java.awt.GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(jLabel5,
                    new java.awt.GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(energyLabel,
                    new java.awt.GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(jLabel6,
                    new java.awt.GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(nbPacketsLabel,
                    new java.awt.GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(jLabel7,
                    new java.awt.GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel5.add(questionLabel,
                    new java.awt.GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.WEST, java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jLabel1.setText("Setup Input File:   ");
        jLabel1.setToolTipText("");
        jLabel2.setText("Output File:   ");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 44));
        jPanel1.add(outputfile,
                    new java.awt.GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.CENTER,
            java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel1.add(jLabel1,
                    new java.awt.GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.CENTER,
            java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel1.add(setupfile,
                    new java.awt.GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.CENTER,
            java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        jPanel1.add(jLabel2,
                    new java.awt.GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            java.awt.GridBagConstraints.CENTER,
            java.awt.GridBagConstraints.NONE,
            new java.awt.Insets(0, 0, 0, 0), 0, 0));
        setupfile.setText(DEFAULT_INPUTFILE);
        setupfile.setMinimumSize(new java.awt.Dimension(50, 20));
        setupfile.setPreferredSize(new java.awt.Dimension(300, 20));
        outputfile.setText(DEFAULT_OUTPUTFILE);
        outputfile.setPreferredSize(new java.awt.Dimension(300, 20));
        outputfile.setMinimumSize(new java.awt.Dimension(50, 20));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2,
            javax.swing.BoxLayout.X_AXIS));
        jPanel2.add(jPanel1);
        jPanel2.add(jPanel3);
        setBounds(new java.awt.Rectangle(0, 0, 661, 393));
        setTitle("PacketWorld batch run program");
        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);
        getContentPane().add(jToolBar1, java.awt.BorderLayout.SOUTH);
        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel3.setSize(new java.awt.Dimension(50, 60));
        jPanel3.add(processButton);
        jPanel3.add(abortButton);
        jPanel3.add(progress);
        //processButton.setText("jButton1");
        //processButton.setLabel("Process");
        processButton.setText("Process");
        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.
            swing.border.BevelBorder.LOWERED));
        jToolBar1.setMinimumSize(new java.awt.Dimension(4, 20));
        jToolBar1.setMaximumSize(new java.awt.Dimension(4, 20));
        jToolBar1.setPreferredSize(new java.awt.Dimension(4, 20));
        jToolBar1.add(status);
        status.setText("");
        status.setAlignmentX(0.0f);
        status.setToolTipText("");
        status.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4,
            javax.swing.BoxLayout.X_AXIS));
        jPanel4.add(jScrollPane1);
        jPanel4.add(jPanel5);
        progress.setValue(0);
        //abortButton.setText("jButton1");
        //abortButton.setLabel("Abort");
        abortButton.setText("Abort");
        abortButton.addActionListener(this::abortButtonActionPerformed);
        processButton.addActionListener(this::processButtonActionPerformed);
        jScrollPane1.getViewport().add(textpane);
        jLabel3.setText("Number of runs: ");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Current run: ");
        jLabel4.setToolTipText("");
        jLabel5.setText("Energy spent in this run: ");
        jLabel5.setToolTipText("");
        jLabel6.setText("Packets delivered this run: ");
        jLabel6.setToolTipText("");
        jLabel7.setText("Questions in this run: ");
        jLabel7.setToolTipText("");
        currentrun.setText("");
        currentrun.setMinimumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        currentrun.setMaximumSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        currentrun.setPreferredSize(new java.awt.Dimension(labelSizeX, labelSizeY));
        currentrun.setHorizontalAlignment(SwingConstants.RIGHT);
        currentrun.setToolTipText("");
        nbruns.setMinimumSize(new java.awt.Dimension(80, 25));
    }

    /**
     * Routine for pressing abort button.
     * Stops simulation and resets GUI
     */
    public void abortButtonActionPerformed(ActionEvent e) {
        Setup.getInstance().stop();
        Setup.getInstance().reset();
        status.setText("Aborted!");
        textOut("****** ABORTED ******");
        processButton.setEnabled(true);
        abortButton.setEnabled(false);
        nbruns.setEnabled(true);
        write(outputvalues);
    }

    /**
     * Routine for pressing 'process' button. Reads setup file, creates simulation
     * and starts first run
     */
    public void processButtonActionPerformed(ActionEvent e) {

        //check input file
        String file = PREFIX + setupfile.getText();
        try {
            //AsciiReader ar = new AsciiReader(file);
            //ar.close();
            status.setText("");

            AsciiReader reader = new AsciiReader(file);
            reader.check("environment");
            String envFile = reader.readNext();
            reader.check("implementation");
            String impl = reader.readNext();

            Setup.getInstance().setImplementation(impl);
            Setup.getInstance().setEnvFile(envFile);
            Setup.getInstance().make(false);

            textOut("****** Starting batch run ******\n");
            textOut("Environment   : " + envFile);
            textOut("Implementation: " + impl);
            Date now = new Date();
            DateFormat df = DateFormat.getTimeInstance(DateFormat.DEFAULT);
            String time = df.format(now);
            textOut("Current time is " + time + "\n");
        } catch (IOException exc) {
            status.setText("Error while opening setup file.");
            return;
        }

        processButton.setEnabled(false);
        abortButton.setEnabled(true);
        nbruns.setEnabled(false);

        //get agentworld set up
        //Setup.getInstance().createEnvFromFile(file);
        Setup.getInstance().setSpeed(0);

        outputvalues = "";

        //start execution
        nbcurrentrun = 1;
        startRun(1);

    }

    /**
     * Event processing
     *
     * AgentActionEvent: increases energy statistic
     * WorldProcessedEvent: updates GUI
     * MsgSentEvent: increases question statistic
     * GameOverEvent: finishes the run and starts the next one
     */
    public void catchEvent(Event e) {
        if (e instanceof AgentActionEvent) {
            AgentActionEvent aae = (AgentActionEvent) e;
            int action = ( (AgentActionEvent) e).getAction();
            switch (action) {
                case AgentActionEvent.PICK:
                case AgentActionEvent.PUT:
                    energy++;
                    break;
                case AgentActionEvent.STEP: {
                    energy++;
                    if ( ( (AgentActionEvent) e).getAgent().carry() != null) {
                        energy++;
                    }
                    break;
                }
            }
        }
        if (e instanceof WorldProcessedEvent) {
            updateProgress();
            updateOutputValues();
            nbCycli++;
            currentrun.setText("" + nbcurrentrun);
            energyLabel.setText("" + energy);
            nbPacketsLabel.setText("" + (startpackets - nbpackets));
            questionLabel.setText("p: " + pmsgs + ", d: " + dmsgs);
            progress.setValue(Math.round(progr));
            jPanel5.repaint();
        }
        if (e instanceof MsgSentEvent) {
            if ( ( (MsgSentEvent) e).isQuestion()) {
                if (((MsgSentEvent) e).getMsg().getMessage().charAt(13) == '1') {
                    dmsgs++;
                } else if (((MsgSentEvent) e).getMsg().getMessage().charAt(13) == '0') {
                    pmsgs++;
                }
            }
        }
        if (e instanceof GameOverEvent) {
            endRun();
            if (Integer.parseInt( (String) nbruns.getSelectedItem()) >
                nbcurrentrun) {
                nbcurrentrun++;
                startRun(nbcurrentrun);
            } else {
                if (write(outputvalues)) {
                    status.setText("Done.");
                }
                Date now = new Date();
                DateFormat df = DateFormat.getTimeInstance(DateFormat.DEFAULT);
                String time = df.format(now);
                textOut("****** Ending batch run ******\n");
                textOut("End time is " + time + "\n");
                textOut("******************************\n");

                processButton.setEnabled(true);
                abortButton.setEnabled(false);
                nbruns.setEnabled(true);
            }
        }
    }

    /**
     * Starts a simulation run. Resets statistics and GUI
     */
    private void startRun(int nb) {
        textOut("*** Starting run number " + nb + " ***\n");
        pmsgs = 0;
        dmsgs = 0;
        energy = 0;
        startpackets = Setup.getInstance().getEnvironment().getPacketWorld().getNbPackets();
        nbpackets = startpackets;
        lastNbPackets = startpackets;
        lastEnergy = 0;
        lastdMsgs = 0;
        lastpMsgs = 0;
        textOut("NbPackets: " + nbpackets);
        Setup.getInstance().getAgentImplementations().startAllAgentImps();
        Setup.getInstance().play();
    }

    /**
     * Ends current simulation run. Resets simulation and prints statistics to log area
     */
    private void endRun() {
        textOut("Energy spent: " + energy);
        textOut("Packet Questions sent: " + pmsgs);
        textOut("Destination Questions sent: " + dmsgs);
        textOut("Turns needed: " + nbCycli);
        textOut("*** Ending run number " + nbcurrentrun + " ***\n");
        Setup.getInstance().reset();
        nbCycli = 0;
    }

    /**
     * updates progress bar
     */
    private void updateProgress() {
        nbpackets = Setup.getInstance().getEnvironment().getPacketWorld().
            getNbPackets();
        int nbrun = Integer.parseInt( (String) nbruns.getSelectedItem());
        float relrun = 100 / (float) nbrun;
        progr = (nbcurrentrun - 1 +
                 ( (startpackets - nbpackets) / (float) startpackets)) * relrun;

    }

    /**
     * updates statistics
     */
    private void updateOutputValues() {
        if (nbpackets != lastNbPackets) {
            float epp = ( (float) (energy - lastEnergy)) /
                ( (float) (lastNbPackets - nbpackets));
            float pques = ( (float) (pmsgs - lastpMsgs)) /
                ( (float) (lastNbPackets - nbpackets));
            float dques = ( (float) (dmsgs - lastdMsgs)) /
                ( (float) (lastNbPackets - nbpackets));
            outputvalues = outputvalues + "NbPackets = " + nbpackets +
                "\nEpp = " + epp + "\nPacketQueues = " + pques +
                "\nDestQueues = " + dques + "\nNbCycli = ";
            lastEnergy = energy;
            lastNbPackets = nbpackets;
            lastdMsgs = dmsgs;
            lastpMsgs = pmsgs;
        }

    }

    /**
     * writes a line of text in log area
     */
    private void textOut(String text) {
        textpane.setText(textpane.getText() + "\n" + text);
    }

    /**
     * writes a string to the file specified in the output box
     */
    private boolean write(String values) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                PREFIX + outputfile.getText()));
            writer.write( nbruns.getSelectedItem() + "\n");
            writer.write("" + startpackets + "\n");
            writer.write(values);
            writer.close();
            return true;
        } catch (IOException ioe) {
            status.setText("Could not write to output file.");
            return false;
        }
    }

    private int energy = 0;
    private int dmsgs = 0;
    private int pmsgs = 0;
    private int nbpackets;
    private int startpackets;
    private int nbcurrentrun;
    private int nbCycli = 0;
    private float progr;
    private int lastEnergy = 0;
    private int lastNbPackets = 0;
    private int lastpMsgs;
    private int lastdMsgs;

    String outputvalues;

    private final JPanel jPanel1 = new JPanel();
    private final JLabel jLabel2 = new JLabel();
    private final JLabel jLabel1 = new JLabel();
    private final JTextField setupfile = new JTextField();
    private final JTextField outputfile = new JTextField();
    private final JPanel jPanel2 = new JPanel();
    private final JPanel jPanel3 = new JPanel();
    private final JButton processButton = new JButton();
    private final JToolBar jToolBar1 = new JToolBar();
    private final JLabel status = new JLabel();
    private final JPanel jPanel4 = new JPanel();
    private final JScrollPane jScrollPane1 = new JScrollPane();
    private final JPanel jPanel5 = new JPanel();
    private final JTextPane textpane = new JTextPane();
    private final JProgressBar progress = new JProgressBar();
    private final JButton abortButton = new JButton();
    private final JLabel jLabel3 = new JLabel();
    private final JLabel jLabel4 = new JLabel();
    private final JComboBox<String> nbruns = new JComboBox<>();
    private final JLabel currentrun = new JLabel();
    private final JLabel energyLabel = new JLabel();
    private final JLabel nbPacketsLabel = new JLabel();
    private final JLabel questionLabel = new JLabel();
    private final JLabel jLabel5 = new JLabel();
    private final JLabel jLabel6 = new JLabel();
    private final JLabel jLabel7 = new JLabel();

    private final String PREFIX = Variables.BASE_PATH + File.separator;
    private final String DEFAULT_INPUTFILE = "configfiles" + File.separator + "setup.txt";
    private final String DEFAULT_OUTPUTFILE = "output.txt";
}