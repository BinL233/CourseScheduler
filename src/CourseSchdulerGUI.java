import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.*;

public class CourseSchdulerGUI extends javax.swing.JFrame {
    private String currentSemester;
    String currentStudent;
    String currentStudentID;
    ArrayList<String> semesterFull = new ArrayList<String>();
    ArrayList<String> selectCourseCode = new ArrayList<String>();
    ArrayList<String> selectCourseDes = new ArrayList<String>();        
    ArrayList<Integer> selectCourseSeats = new ArrayList<Integer>(); 
    ArrayList<String> selectCourseCodeS = new ArrayList<String>();
    ArrayList<String> selectStatus = new ArrayList<String>();  
    ArrayList<String> selectDropCourse = new ArrayList<String>();  

    public CourseSchdulerGUI() {
        initComponents();
        currentSemesterCourse();
        rebuildSemesterComboboxes();
        rebuildCourse();
        rebuildStudent();
        rebuildScheduleTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        semesterCombobox = new javax.swing.JComboBox<>();
        changeSemesterButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        addSemesterButton = new javax.swing.JButton();
        addSemesterStatusLabel = new javax.swing.JLabel();
        semesterNameText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        studentIDText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        addStudentButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        courseCodeText = new javax.swing.JTextField();
        courseDescriptionText = new javax.swing.JTextField();
        seatsSpinner = new javax.swing.JSpinner();
        addCourseButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        displayCourseListCombobox = new javax.swing.JComboBox<>();
        displayCourseListDisplayButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        scheduledStudentsTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        waitlistedStudentsTable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        dropStudentCombobox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        deopStudentTextArea = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        dropCourceSelectCombobox2 = new javax.swing.JComboBox<>();
        dropCourseButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        dropCourseTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayCourseTable = new javax.swing.JTable();
        displayCoursesbutton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        selectCourseCombobox = new javax.swing.JComboBox<>();
        scheduleCoursesSubmit = new javax.swing.JButton();
        scheduleCoursesSusLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displaySchedulestable = new javax.swing.JTable();
        displayButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        selectDropCourseCombobox = new javax.swing.JComboBox<>();
        dropCourseButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dropCourseTextArea = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        currentStudentLabel = new javax.swing.JLabel();
        currentStudentCombobox = new javax.swing.JComboBox<>();
        changeStudentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        jLabel1.setText("Course Schedule");

        jLabel2.setText("Current Semester:");

        jLabel3.setText("None");

        semesterCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboboxActionPerformed(evt);
            }
        });

        changeSemesterButton.setText("Change Semester");
        changeSemesterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSemesterButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Semester Name:");

        addSemesterButton.setText("Submit");
        addSemesterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSemesterButtonActionPerformed(evt);
            }
        });

        semesterNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterNameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semesterNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(addSemesterButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addSemesterStatusLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(semesterNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSemesterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSemesterStatusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Semester", jPanel3);

        jLabel9.setText("Student ID:");

        jLabel10.setText("First Name:");

        jLabel11.setText("Last Name:");

        addStudentButton.setText("Submit");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudentButton)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstNameText)
                        .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(studentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(addStudentButton)
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Student", jPanel4);

        jLabel5.setText("Course Code:");

        jLabel6.setText("Course Description:");

        jLabel7.setText("Seats:");

        addCourseButton.setText("Submit");
        addCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCourseButton)
                            .addComponent(seatsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(courseCodeText)
                                .addComponent(courseDescriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(courseCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(courseDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(seatsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCourseButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Course", jPanel5);

        jLabel17.setText("Select Cource:");

        displayCourseListDisplayButton.setText("Display");
        displayCourseListDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCourseListDisplayButtonActionPerformed(evt);
            }
        });

        scheduledStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Student ID"
            }
        ));
        jScrollPane4.setViewportView(scheduledStudentsTable);

        waitlistedStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Student ID"
            }
        ));
        jScrollPane5.setViewportView(waitlistedStudentsTable);

        jLabel19.setText("Scheduled Students:");

        jLabel20.setText("Waitlisted Students:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayCourseListCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(displayCourseListDisplayButton))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(displayCourseListCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayCourseListDisplayButton))
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Display Course List of Students", jPanel10);

        jLabel21.setText("Select Students:");

        dropStudentCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropStudentComboboxActionPerformed(evt);
            }
        });

        jButton1.setText("Drop Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deopStudentTextArea.setColumns(20);
        deopStudentTextArea.setRows(5);
        jScrollPane6.setViewportView(deopStudentTextArea);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dropStudentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(jButton1)
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(dropStudentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Drop Student", jPanel11);

        jLabel15.setText("Select Cource to be Dropped:");

        dropCourseButton2.setText("Drop Course");
        dropCourseButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropCourseButton2ActionPerformed(evt);
            }
        });

        dropCourseTextArea2.setColumns(20);
        dropCourseTextArea2.setRows(5);
        jScrollPane7.setViewportView(dropCourseTextArea2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dropCourceSelectCombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(dropCourseButton2)
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dropCourceSelectCombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropCourseButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Drop Cource", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Admin", jPanel1);

        displayCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Seats", "Description"
            }
        ));
        jScrollPane2.setViewportView(displayCourseTable);

        displayCoursesbutton.setText("Display");
        displayCoursesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCoursesbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(displayCoursesbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayCoursesbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Display Courses", jPanel6);

        jLabel13.setText("Select Course:");

        scheduleCoursesSubmit.setText("Submit");
        scheduleCoursesSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleCoursesSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34)
                        .addComponent(selectCourseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(scheduleCoursesSubmit))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scheduleCoursesSusLabel))
                    .addComponent(jLabel14))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(selectCourseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(scheduleCoursesSubmit)
                .addGap(18, 18, 18)
                .addComponent(scheduleCoursesSusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Schedule Courses", jPanel7);

        displaySchedulestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Status"
            }
        ));
        jScrollPane1.setViewportView(displaySchedulestable);

        displayButton.setText("Display");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(displayButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Display Schedules", jPanel8);

        jLabel18.setText("Select Course:");

        dropCourseButton.setText("Drop Course");
        dropCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropCourseButtonActionPerformed(evt);
            }
        });

        dropCourseTextArea.setColumns(20);
        dropCourseTextArea.setRows(5);
        jScrollPane3.setViewportView(dropCourseTextArea);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectDropCourseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(dropCourseButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(selectDropCourseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dropCourseButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Drop Courses", jPanel9);

        jLabel16.setText("Current Student:");

        currentStudentLabel.setText("None");

        changeStudentButton.setText("Change Student");
        changeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentStudentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentStudentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(changeStudentButton)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(currentStudentLabel)
                    .addComponent(currentStudentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeStudentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(semesterCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeSemesterButton)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(semesterCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSemesterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void changeSemesterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSemesterButtonActionPerformed
        // TODO add your handling code here:
        String semester = (String) semesterCombobox.getSelectedItem();
        jLabel3.setText(semester);
        currentSemesterCourse();
    }//GEN-LAST:event_changeSemesterButtonActionPerformed

    private void semesterNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterNameTextActionPerformed

    public void rebuildScheduleTable() {
        currentSchedule();
        String status = "";
        DefaultTableModel model = (DefaultTableModel) displaySchedulestable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < selectCourseCodeS.size(); i++) {
            if (selectStatus.get(i) == "W") {
                status = "Waitlisted";
            }
            
            else {
                status = "Scheduled";
            }
            model.addRow(new Object[]{selectCourseCodeS.get(i), status});
            }        
        
    }  
    
    public void currentSchedule() {  
        Connection connect = DatabaseConnection.getConnect(); 
        if ((String)currentStudentCombobox.getSelectedItem() != null){
        try {
        selectStatus.clear();
        selectCourseCodeS.clear();
        String semester = jLabel3.getText();
        String studentID = "null";
        String studentName = currentStudentLabel.getText();
        String [] arr = studentName.split("\\s+");
        PreparedStatement getID = connect.prepareStatement("SELECT STUDENTID FROM APP.STUDENT WHERE FIRSTNAME = '" + arr[0] + "' AND LASTNAME = '"
            + arr[1] + "'");
        ResultSet resultSet = getID.executeQuery();
            
        while(resultSet.next()) {
            studentID = resultSet.getString(1);
            }
        
        PreparedStatement getCourseCode = connect.prepareStatement("SELECT COURSECODE FROM APP.SCHEDULE WHERE SEMESTER = '" 
                + semester + "' AND STUDENTID = '" + studentID + "'");
        ResultSet resultSet1 = getCourseCode.executeQuery();
        
        while(resultSet1.next()) {
                selectCourseCodeS.add(resultSet1.getString(1));
            }
        
        PreparedStatement getStatus = connect.prepareStatement("SELECT STATUS FROM APP.SCHEDULE WHERE SEMESTER = '" 
                + semester + "' AND STUDENTID = '" + studentID + "'");
        ResultSet resultSet2 = getStatus.executeQuery();
        
        while(resultSet2.next()) {
                selectStatus.add(resultSet2.getString(1));
            }
        }
        
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }  
    }
    }
    
    public void currentSemesterCourse() {
        Connection connect = DatabaseConnection.getConnect();     
        try {
        selectCourseCode.clear();
        selectCourseDes.clear();
        selectCourseSeats.clear();
        selectDropCourse.clear();
        String semester = jLabel3.getText();
        
        PreparedStatement getCourseCode = connect.prepareStatement("SELECT COURSECODE FROM APP.COURSE WHERE SEMESTER = '" 
                + semester + "'");
        ResultSet resultSet1 = getCourseCode.executeQuery();
        
        while(resultSet1.next()) {
                selectCourseCode.add(resultSet1.getString(1));
            }
        
        PreparedStatement getDropCourseCode = connect.prepareStatement("SELECT COURSECODE FROM APP.SCHEDULE WHERE SEMESTER = '" 
                + semester + "' AND STUDENTID = '" + currentStudentID + "'");
        ResultSet resultSet4 = getDropCourseCode.executeQuery();
        
        while(resultSet4.next()) {
                selectDropCourse.add(resultSet4.getString(1));
            }
        
        PreparedStatement getCourseDes = connect.prepareStatement("SELECT DESCRIPTION FROM APP.COURSE WHERE SEMESTER = '" 
                + semester + "'");
        ResultSet resultSet2 = getCourseDes.executeQuery();
        
        while(resultSet2.next()) {
                selectCourseDes.add(resultSet2.getString(1));
            }

        PreparedStatement getCourseSeats = connect.prepareStatement("SELECT SEATS FROM APP.COURSE WHERE SEMESTER = '" 
                + semester + "'");
        ResultSet resultSet3 = getCourseSeats.executeQuery();
        
        while(resultSet3.next()) {
                selectCourseSeats.add(resultSet3.getInt(1));
            }   
        selectCourseCombobox.setModel(new javax.swing.DefaultComboBoxModel(selectCourseCode.toArray()));
        displayCourseListCombobox.setModel(new javax.swing.DefaultComboBoxModel(selectCourseCode.toArray()));
        dropCourceSelectCombobox2.setModel(new javax.swing.DefaultComboBoxModel(selectCourseCode.toArray()));
        selectDropCourseCombobox.setModel(new javax.swing.DefaultComboBoxModel(selectDropCourse.toArray()));
        }

        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }  
    }    
    
    public void rebuildSemesterComboboxes() {
        ArrayList<String> semesters = SemesterQueries.getSemesterList();
        semesterCombobox.setModel(new javax.swing.DefaultComboBoxModel(semesters.toArray()));
        if (semesters.size() > 0) {
            jLabel3.setText(semesters.get(0));
        }
        else {
            jLabel3.setText("None, add a semester.");
            currentSemester = "None";
        }
    }
    
    public void rebuildStudentComboboxes() {
        ArrayList<String> students = StudentQueries.getStudentIDList();
        if (students.size() > 0) {
            currentStudentLabel.setText(students.get(0));
        }
        else {
            currentStudentLabel.setText("None");
        }
    }
    
    
    public void rebuildCourse() {
        currentSemesterCourse();
        DefaultTableModel model = (DefaultTableModel) displayCourseTable.getModel();
        model.setRowCount(0);        
        for (int i = 0; i < selectCourseCode.size(); i++) {
            model.addRow(new Object[]{selectCourseCode.get(i), String.valueOf(selectCourseSeats.get(i)), selectCourseDes.get(i)});
            }
   
        
    }
    
    public void rebuildStudent() {
        ArrayList<String> studentID = StudentQueries.getStudentIDList();
        ArrayList<String> firstName = StudentQueries.getStudentFList();
        ArrayList<String> lastName = StudentQueries.getStudentLList();
        ArrayList<String> fullName = new ArrayList<String>();
        for (int i = 0; i < studentID.size(); i++) {
            fullName.add(firstName.get(i) + ' ' + lastName.get(i) + ' ' + studentID.get(i));
        }
        currentStudentCombobox.setModel(new javax.swing.DefaultComboBoxModel(fullName.toArray()));    
        dropStudentCombobox.setModel(new javax.swing.DefaultComboBoxModel(fullName.toArray()));  
        //selectStudentCombobox1.setModel(new javax.swing.DefaultComboBoxModel(fullName.toArray()));
        if (studentID.size() > 0) {
            currentStudentLabel.setText(fullName.get(0));
            currentStudentID = studentID.get(0);
            
        }
        else {
            currentStudentLabel.setText("None");
            currentStudent = "None";
        }        
        
        
    }
    
    
    private void addSemesterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSemesterButtonActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect();
        try {
            String semesterName = semesterNameText.getText();
            semesterCombobox.addItem(semesterName);
            jLabel3.setText(semesterName);
            String INSERT = "INSERT INTO APP.SEMESTER (SEMESTER) VALUES ('" + semesterName + "')";
            PreparedStatement addSemester = connect.prepareStatement(INSERT);
            addSemester.executeUpdate();
            addSemesterStatusLabel.setText("Add semester successfully!");
                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }
        
    }//GEN-LAST:event_addSemesterButtonActionPerformed

    private void semesterComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_semesterComboboxActionPerformed

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect();
        try {
            String semester = jLabel3.getText();
            String courseCode = courseCodeText.getText();
            String courseDescription = courseDescriptionText.getText();
            int seats = (Integer) seatsSpinner.getValue();
            selectCourseCombobox.addItem(courseCode);
            displayCourseListCombobox.addItem(courseCode);
            dropCourceSelectCombobox2.addItem(courseCode);
            PreparedStatement addSemester = connect.prepareStatement("INSERT INTO APP.COURSE (COURSECODE , DESCRIPTION , SEMESTER , SEATS) "
                    + "VALUES ('" + courseCode + "' , '" + courseDescription + "' , '" + semester + "' , " + seats + ")");
            addSemester.executeUpdate();

            jLabel8.setText("Add course successfully!");
                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }
    }//GEN-LAST:event_addCourseButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect();
        try {
            String studentID = studentIDText.getText();
            String firstName = firstNameText.getText();
            String lastName = lastNameText.getText();
            currentStudentCombobox.addItem(firstName + ' ' + lastName + ' ' + studentID);
            dropStudentCombobox.addItem(firstName + ' ' + lastName + ' ' + studentID);
            //selectStudentCombobox1.addItem(firstName + ' ' + lastName);
            PreparedStatement addSemester = connect.prepareStatement("INSERT INTO APP.STUDENT (STUDENTID , FIRSTNAME , LASTNAME) "
                    + "VALUES ('" + studentID + "' , '" + firstName + "' , '" + lastName + "')");
            addSemester.executeUpdate();
            if (currentStudentLabel.getText() == "None"){
            currentStudentLabel.setText(firstName + ' ' + lastName + ' ' + studentID);
            }
            

            jLabel12.setText("Add student successfully!");
                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void scheduleCoursesSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleCoursesSubmitActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect();
        if ((String)currentStudentCombobox.getSelectedItem() != null){
        try {
            String semester = jLabel3.getText();
            String status1 = "";
            String studentName = currentStudentLabel.getText();
            String courseCode = (String)selectCourseCombobox.getSelectedItem();
            String studentID = "null";
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            int seats = 0;
            String [] arr = studentName.split("\\s+");
            PreparedStatement getID = connect.prepareStatement("SELECT STUDENTID FROM APP.STUDENT WHERE FIRSTNAME = '" + arr[0] + "' AND LASTNAME = '"
            + arr[1] + "'");
            ResultSet resultSet1 = getID.executeQuery();
            
            while(resultSet1.next()) {
                studentID = resultSet1.getString(1);
            }
            
            PreparedStatement getSeats = connect.prepareStatement("SELECT SEATS FROM APP.COURSE WHERE COURSECODE = '" + courseCode + "' AND "
                    + "SEMESTER = '" + jLabel3.getText() + "'");
            ResultSet resultSet = getSeats.executeQuery();
            
            while(resultSet.next()) {
                seats = resultSet.getInt(1);
            }
            System.out.println(seats);
            
            if (seats > 0){
                status1 = "S";
            }
            
            else{
                status1 = "W";
            }
            
            PreparedStatement insertSche = connect.prepareStatement("INSERT INTO APP.SCHEDULE (SEMESTER , STUDENTID , COURSECODE , STATUS, TIMESTAMP) "
                    + "VALUES ('" + semester + "' , '" + studentID + "' , '" + courseCode + "' , '" + status1 + "' , '" 
                    + currentTimestamp + "')");
            insertSche.executeUpdate();
            seats -= 1;
            
            PreparedStatement setSeats = connect.prepareStatement("UPDATE APP.COURSE SET SEATS = " + seats + " WHERE COURSECODE = '" + courseCode + 
                    "' AND SEMESTER = '" + jLabel3.getText() + "'");
            setSeats.executeUpdate();  

            
            

            jLabel14.setText("Add schedule successfully!");
                    }
            
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
                
        }
        }
    }//GEN-LAST:event_scheduleCoursesSubmitActionPerformed

    private void displayCoursesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCoursesbuttonActionPerformed
        // TODO add your handling code here:
        currentSemesterCourse();
        DefaultTableModel model = (DefaultTableModel) displayCourseTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < selectCourseCode.size(); i++) {
            model.addRow(new Object[]{selectCourseCode.get(i), String.valueOf(selectCourseSeats.get(i)), selectCourseDes.get(i)});
            
        }
      
    }//GEN-LAST:event_displayCoursesbuttonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        // TODO add your handling code here:
        
        currentSchedule();
        String status = "";
        DefaultTableModel model = (DefaultTableModel) displaySchedulestable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < selectCourseCodeS.size(); i++) {
            if ("W".equals(selectStatus.get(i))) {
                status = "Waitlisted";
            }
            
            else {
                status = "Scheduled";
            }
            model.addRow(new Object[]{selectCourseCodeS.get(i), status});
            }
        
        
      
        
    }//GEN-LAST:event_displayButtonActionPerformed

    private void changeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeStudentButtonActionPerformed
        // TODO add your handling code here:
        currentStudent = (String)currentStudentCombobox.getSelectedItem();
        currentStudentLabel.setText(currentStudent);
        selectDropCourse.clear();
        String [] arr = currentStudent.split("\\s+");
        
        Connection connect = DatabaseConnection.getConnect();
        try {
            PreparedStatement getDropCourseCode = connect.prepareStatement("SELECT COURSECODE FROM APP.SCHEDULE WHERE SEMESTER = '" 
                    + jLabel3.getText() + "' AND STUDENTID = '" + arr[2] + "'");
            ResultSet resultSet4 = getDropCourseCode.executeQuery();

            while(resultSet4.next()) {
                    selectDropCourse.add(resultSet4.getString(1));
                }
            System.out.println(selectDropCourse);
            
            selectDropCourseCombobox.setModel(new javax.swing.DefaultComboBoxModel(selectDropCourse.toArray()));
            
            

                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }        
        
        
    }//GEN-LAST:event_changeStudentButtonActionPerformed

    private void dropCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropCourseButtonActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect();
        try {
            int seats = 0;
            String studentW = "";
            String nameFW = "";
            String nameLW = "";
            String student = currentStudentLabel.getText();
            String course = (String)selectDropCourseCombobox.getSelectedItem();
            int index = selectDropCourseCombobox.getSelectedIndex();
            dropCourseTextArea.append(student + " has been dropped from " + course + "\n");     
            String [] arr = student.split("\\s+");
            
            PreparedStatement deleteCourse = connect.prepareStatement("DELETE FROM APP.SCHEDULE WHERE STUDENTID = '" + arr[2] + "' AND"
                    + " COURSECODE = '" + course + "' AND SEMESTER = '" + jLabel3.getText() + "'");
            deleteCourse.executeUpdate();
            
            
            selectDropCourseCombobox.removeItemAt(index);
            
            PreparedStatement getSeats = connect.prepareStatement("SELECT SEATS FROM APP.COURSE WHERE COURSECODE = '" + course + 
                    "' AND SEMESTER = '" + jLabel3.getText() + "'");
            ResultSet resultSet = getSeats.executeQuery();
            
            while(resultSet.next()) {
                seats = resultSet.getInt(1);
            }
            
            seats += 1;
            PreparedStatement addSeats = connect.prepareStatement("UPDATE APP.COURSE SET SEATS = " + seats + " WHERE COURSECODE = '" + course + 
                    "' AND SEMESTER = '" + jLabel3.getText() + "'");
            addSeats.executeUpdate(); 
            

            PreparedStatement getSW = connect.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE "
                + "COURSECODE = '" + course + "' AND STATUS = 'W' AND SEMESTER = '" + jLabel3.getText() + "' ORDER BY TIMESTAMP");
            ResultSet resultSet6 = getSW.executeQuery();

            while(resultSet6.next()) {
                studentW = resultSet6.getString(1);
                    }
                    



            if(studentW != ""){

                        PreparedStatement getFW = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT WHERE "
                                + "STUDENTID = '" + studentW + "'");
                        ResultSet resultSet7 = getFW.executeQuery(); 

                        while(resultSet7.next()) {
                                nameFW = resultSet7.getString(1);
                            }  

                        PreparedStatement getLW = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT WHERE "
                                + "STUDENTID = '" + studentW + "'");
                        ResultSet resultSet8 = getLW.executeQuery(); 


                        while(resultSet8.next()) {
                                nameLW = resultSet8.getString(1);
                            } 
                        String nameFullW  = nameFW + " " + nameLW + " " + studentW;
                        dropCourseTextArea.append(nameFullW + " has been scheduled into " + course);

                        }            

                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }
    }//GEN-LAST:event_dropCourseButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fullName = (String)dropStudentCombobox.getSelectedItem();
        Connection connect = DatabaseConnection.getConnect();
        try {
            ArrayList<String> id = new ArrayList<String>();
            ArrayList<String> course = new ArrayList<String>();
            ArrayList<Integer> remainSeats = new ArrayList<Integer>();
            ArrayList<String> studentW = new ArrayList<String>();
            ArrayList<String> nameFW = new ArrayList<String>();
            ArrayList<String> nameLW = new ArrayList<String>();
            ArrayList<String> nameFullW = new ArrayList<String>();
            ArrayList<String> semesters = SemesterQueries.getSemesterList();
            String [] arr = fullName.split("\\s+");
            
            
            PreparedStatement getID = connect.prepareStatement("SELECT STUDENTID FROM APP.STUDENT WHERE "
                    + "FIRSTNAME = '" + arr[0] + "' AND LASTNAME = '" + arr[1] + "'");
            ResultSet resultSet = getID.executeQuery();

            while(resultSet.next()) {
                    id.add(resultSet.getString(1));
                } 
            PreparedStatement deleteSt = connect.prepareStatement("DELETE FROM APP.STUDENT WHERE "
                        + "STUDENTID = '" + id.get(0) + "'");
            deleteSt.executeUpdate();            

            int index = dropStudentCombobox.getSelectedIndex();
            dropStudentCombobox.removeItemAt(index);
            deopStudentTextArea.append(fullName + " has been dropped from the list of students.\n\n");
            
            for(int x = 0; x < semesters.size(); x++) {
                deopStudentTextArea.append("\nFor semester: " + semesters.get(x) + "\n");

                PreparedStatement getCourse = connect.prepareStatement("SELECT COURSECODE FROM APP.SCHEDULE WHERE "
                        + "STUDENTID = '" + id.get(0) + "' AND SEMESTER = '" + semesters.get(x) + "'");
                ResultSet resultSet1 = getCourse.executeQuery();

                while(resultSet1.next()) {
                        course.add(resultSet1.getString(1));
                    }
                  
                PreparedStatement deleteCourse = connect.prepareStatement("DELETE FROM APP.SCHEDULE WHERE "
                                + "STUDENTID = '" + id.get(0) + "' AND SEMESTER = '" + semesters.get(x) + "'");
                deleteCourse.executeUpdate(); 


                for(int i = 0; i < course.size(); i++){
                    PreparedStatement getSeats = connect.prepareStatement("SELECT SEATS FROM APP.COURSE WHERE "
                           + "COURSECODE = '" + course.get(i) + "' AND SEMESTER = '" + semesters.get(x) + "'");
                    ResultSet resultSet5 = getSeats.executeQuery();


                    while(resultSet5.next()) {
                            remainSeats.add(resultSet5.getInt(1));
                        }  

                    int remainSeat = remainSeats.get(0) + 1;

                    PreparedStatement upSeats = connect.prepareStatement("UPDATE APP.COURSE SET SEATS = " + remainSeat + " WHERE "
                            + "COURSECODE = '" + course.get(i) + "' AND SEMESTER = '" + semesters.get(x) + "'");
                    upSeats.executeUpdate(); 
                    

                    PreparedStatement getSW = connect.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE "
                            + "COURSECODE = '" + course.get(i) + "' AND STATUS = 'W' AND SEMESTER = '" + semesters.get(x) + "' ORDER BY TIMESTAMP");
                    ResultSet resultSet6 = getSW.executeQuery();

                    while(resultSet6.next()) {
                            studentW.add(resultSet6.getString(1));
                    }
                    



                    if(!studentW.isEmpty()){

                        PreparedStatement getFW = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT WHERE "
                                + "STUDENTID = '" + studentW.get(0) + "'");
                        ResultSet resultSet7 = getFW.executeQuery(); 

                        while(resultSet7.next()) {
                                nameFW.add(resultSet7.getString(1));
                            }  

                        PreparedStatement getLW = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT WHERE "
                                + "STUDENTID = '" + studentW.get(0) + "'");
                        ResultSet resultSet8 = getLW.executeQuery(); 


                        while(resultSet8.next()) {
                                nameLW.add(resultSet8.getString(1));
                            } 
                        nameFullW.add(nameFW.get(0) + " " + nameLW.get(0) + " " + studentW.get(0));

                        }

                    deopStudentTextArea.append(fullName + " has been dropped from " + course.get(i) + "\n");
                    if (!studentW.isEmpty()){
                        deopStudentTextArea.append(nameFullW.get(0) + " has been scheduled from " + course.get(i) + "\n");
                        PreparedStatement scheduleCourse = connect.prepareStatement("UPDATE APP.SCHEDULE SET STATUS = 'S' WHERE "
                            + "STUDENTID = '" + studentW.get(0) + "' AND SEMESTER = '" + semesters.get(x) + "' AND COURSECODE = '" + course.get(i) + "'");
                        scheduleCourse.executeUpdate();  

                        

                    }
                    nameFullW.clear();
                    studentW.clear();
                    remainSeats.clear();
                     
                    nameFW.clear();
                    nameLW.clear();
                    nameFullW.clear();
                }
                course.clear();
            }
            deopStudentTextArea.append(fullName + "\n Jones, Sue has been removed from all the student comboboxes. \n");
            currentStudentCombobox.removeAllItems();
            this.rebuildStudent();
                       
            id.clear();
                 
                    }
        
        
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }        
          
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayCourseListDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCourseListDisplayButtonActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect(); 
        ArrayList<String> idS = new ArrayList<String>();
        ArrayList<String> firstNameS = new ArrayList<String>();
        ArrayList<String> lastNameS = new ArrayList<String>();
        ArrayList<String> idW = new ArrayList<String>();
        ArrayList<String> firstNameW = new ArrayList<String>();
        ArrayList<String> lastNameW = new ArrayList<String>();
        DefaultTableModel model = (DefaultTableModel) scheduledStudentsTable.getModel();
        model.setRowCount(0);
        DefaultTableModel modelW = (DefaultTableModel) waitlistedStudentsTable.getModel();
        modelW.setRowCount(0);
        
        try {
        idS.clear();
        firstNameS.clear();
        lastNameW.clear();
        idW.clear();
        firstNameW.clear();
        lastNameW.clear();
        
        String course = (String)displayCourseListCombobox.getSelectedItem();
        String semester = jLabel3.getText();
        
        PreparedStatement getID = connect.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE SEMESTER = '" 
                + semester + "' AND COURSECODE = '" + course + "' AND STATUS = 'S'");
        ResultSet resultSet2 = getID.executeQuery();
        
        while(resultSet2.next()) {
                idS.add(resultSet2.getString(1));
            }

        PreparedStatement getIDW = connect.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE SEMESTER = '" 
                + semester + "' AND COURSECODE = '" + course + "' AND STATUS = 'W'");
        ResultSet resultSet3 = getIDW.executeQuery();
        
        while(resultSet3.next()) {
                idW.add(resultSet3.getString(1));
            }
        
        if(idS.size()!= 0){
        for(int counter = 0; counter < idS.size(); counter++) {

            PreparedStatement getFN = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT WHERE STUDENTID = '" + idS.get(counter) + "'");
            ResultSet resultSet = getFN.executeQuery();

            while(resultSet.next()) {
                    firstNameS.add(resultSet.getString(1));
                }



            PreparedStatement getLN = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT WHERE STUDENTID = '" + idS.get(counter) + "'");
            ResultSet resultSet1 = getLN.executeQuery();

            while(resultSet1.next()) {
                    lastNameS.add(resultSet1.getString(1));
                }
            model.addRow(new Object[]{firstNameS.get(counter), lastNameS.get(counter), idS.get(counter)});
            }
        }
            
        if(idW.size() != 0){
        for(int counter = 0; counter < idW.size(); counter++) {
            
            PreparedStatement getFNW = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT WHERE STUDENTID = '" + idW.get(counter) + "'");
            ResultSet resultSet4 = getFNW.executeQuery();

            while(resultSet4.next()) {
                    firstNameW.add(resultSet4.getString(1));
                }



            PreparedStatement getLNW = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT WHERE STUDENTID = '" + idW.get(counter) + "'");
            ResultSet resultSet5 = getLNW.executeQuery();

            while(resultSet5.next()) {
                    lastNameW.add(resultSet5.getString(1));
                }
            modelW.addRow(new Object[]{firstNameW.get(counter), lastNameW.get(counter), idW.get(counter)});       
            }
            

     
        
        }

       
        }
        
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }  
       
    }//GEN-LAST:event_displayCourseListDisplayButtonActionPerformed

    private void dropStudentComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropStudentComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropStudentComboboxActionPerformed

    private void dropCourseButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropCourseButton2ActionPerformed
        // TODO add your handling code here:
        Connection connect = DatabaseConnection.getConnect();
        try {
            String selectCourse = (String)dropCourceSelectCombobox2.getSelectedItem();
            ArrayList<String> idS = new ArrayList<String>();
            ArrayList<String> idW = new ArrayList<String>();
            ArrayList<String> nameF = new ArrayList<String>();
            ArrayList<String> nameL = new ArrayList<String>();
            ArrayList<String> nameFull = new ArrayList<String>();
            PreparedStatement getSchStudent = connect.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE COURSECODE = '" 
                    + selectCourse + "' AND STATUS = 'S'");
            ResultSet resultSet = getSchStudent.executeQuery();

            while(resultSet.next()) {
                    idS.add(resultSet.getString(1));
                }
            
            PreparedStatement getSchStudentW = connect.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE COURSECODE = '" 
                    + selectCourse + "' AND STATUS = 'W'");
            ResultSet resultSet3 = getSchStudentW.executeQuery();

            while(resultSet3.next()) {
                    idW.add(resultSet3.getString(1));
                }
            
            dropCourseTextArea2.append("Scheduled students dropped from the course:\n");
            for(int i = 0; i < idS.size(); i++){
                
                PreparedStatement getF = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT WHERE "
                            + "STUDENTID = '" + idS.get(i) + "'");
                ResultSet resultSet1 = getF.executeQuery(); 

                while(resultSet1.next()) {
                    nameF.add(resultSet1.getString(1));
                        }  

                PreparedStatement getL = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT WHERE "
                            + "STUDENTID = '" + idS.get(i) + "'");
                ResultSet resultSet2 = getL.executeQuery(); 


                while(resultSet2.next()) {
                    nameL.add(resultSet2.getString(1));
                        } 
                nameFull.add(nameF.get(i) + " " + nameL.get(i) + " " + idS.get(i));

                PreparedStatement deleteStudent = connect.prepareStatement("DELETE FROM APP.SCHEDULE WHERE STUDENTID = '" + idS.get(i) + "' AND"
                        + "  SEMESTER = '" + jLabel3.getText() + "'");
                deleteStudent.executeUpdate();       

                dropCourseTextArea2.append(nameFull.get(i) + "\n");

                }
            
            nameF.clear();
            nameL.clear();
            nameFull.clear();
            
            dropCourseTextArea2.append("Waitlisted students dropped from the course:\n");
            for(int i = 0; i < idW.size(); i++){

                PreparedStatement getF = connect.prepareStatement("SELECT FIRSTNAME FROM APP.STUDENT WHERE "
                            + "STUDENTID = '" + idW.get(i) + "'");
                ResultSet resultSet1 = getF.executeQuery(); 

                while(resultSet1.next()) {
                    nameF.add(resultSet1.getString(1));
                        }  

                PreparedStatement getL = connect.prepareStatement("SELECT LASTNAME FROM APP.STUDENT WHERE "
                            + "STUDENTID = '" + idW.get(i) + "'");
                ResultSet resultSet2 = getL.executeQuery(); 


                while(resultSet2.next()) {
                    nameL.add(resultSet2.getString(1));
                        } 
                nameFull.add(nameF.get(i) + " " + nameL.get(i) + " " + idW.get(i));

                PreparedStatement deleteStudent = connect.prepareStatement("DELETE FROM APP.SCHEDULE WHERE STUDENTID = '" + idW.get(i) + "' AND"
                        + "  SEMESTER = '" + jLabel3.getText() + "'");
                deleteStudent.executeUpdate();       

                dropCourseTextArea2.append(nameFull.get(i) + "\n");

                    }            
            PreparedStatement deleteCourse = connect.prepareStatement("DELETE FROM APP.COURSE WHERE COURSECODE = '" + selectCourse + "' AND"
                        + "  SEMESTER = '" + jLabel3.getText() + "'");
            deleteCourse.executeUpdate(); 
            int index = dropCourceSelectCombobox2.getSelectedIndex();
            displayCourseListCombobox.removeItemAt(index);
            selectCourseCombobox.removeItemAt(index);
            
                    }
            
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
                }        
    }//GEN-LAST:event_dropCourseButton2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourseSchdulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseSchdulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseSchdulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseSchdulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseSchdulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JButton addSemesterButton;
    private javax.swing.JLabel addSemesterStatusLabel;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton changeSemesterButton;
    private javax.swing.JButton changeStudentButton;
    private javax.swing.JTextField courseCodeText;
    private javax.swing.JTextField courseDescriptionText;
    private javax.swing.JComboBox<String> currentStudentCombobox;
    private javax.swing.JLabel currentStudentLabel;
    private javax.swing.JTextArea deopStudentTextArea;
    private javax.swing.JButton displayButton;
    private javax.swing.JComboBox<String> displayCourseListCombobox;
    private javax.swing.JButton displayCourseListDisplayButton;
    private javax.swing.JTable displayCourseTable;
    private javax.swing.JButton displayCoursesbutton;
    private javax.swing.JTable displaySchedulestable;
    private javax.swing.JComboBox<String> dropCourceSelectCombobox2;
    private javax.swing.JButton dropCourseButton;
    private javax.swing.JButton dropCourseButton2;
    private javax.swing.JTextArea dropCourseTextArea;
    private javax.swing.JTextArea dropCourseTextArea2;
    private javax.swing.JComboBox<String> dropStudentCombobox;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JButton scheduleCoursesSubmit;
    private javax.swing.JLabel scheduleCoursesSusLabel;
    private javax.swing.JTable scheduledStudentsTable;
    private javax.swing.JSpinner seatsSpinner;
    private javax.swing.JComboBox<String> selectCourseCombobox;
    private javax.swing.JComboBox<String> selectDropCourseCombobox;
    private javax.swing.JComboBox<String> semesterCombobox;
    private javax.swing.JTextField semesterNameText;
    private javax.swing.JTextField studentIDText;
    private javax.swing.JTable waitlistedStudentsTable;
    // End of variables declaration//GEN-END:variables
}
