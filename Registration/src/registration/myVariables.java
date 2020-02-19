/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

/**
 *
 * @author Phil Rey
 */
public class myVariables {
    private static String ipAddress;
    private static String schoolName;
    private static String schoolId;
    private static String region;
    private static String division;
    private static String district;
    private static String principal;
    
    //Icons
    private static final String studentsIcon = "Imagez/Icons/icons8_user_30px.png";
    private static final String studentsPrsnlInfIcon = "Imagez/Icons/icons8_name_tag_30px.png";
    private static final String subjectsIcon = "Imagez/Icons/icons8_books_30px.png";
    private static final String subjeLoadsIcon = "Imagez/Icons/icons8_book_shelf_30px.png";
    private static final String usersIcon = "Imagez/Icons/icons8_school_director_30px.png";
    private static final String usersPrsnlInfIcon = "Imagez/Icons/icons8_profile_30px.png";
    
    private static final String addIcon = "Imagez/Icons/icons8_add_25px_1.png";
    private static final String editIcon = "Imagez/Icons/icons8_pencil_drawing_25px.png";
    //Window Icons
    private static final String registrationWindowIcon = "Imagez/Window Icons/registration.png";
    //<editor-fold desc="Getters & Setters">

    public static String getAddIcon() {
        return addIcon;
    }

    public static String getEditIcon() {
        return editIcon;
    }
    
    public static String getRegistrationWindowIcon() {
        return registrationWindowIcon;
    }
    
    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        myVariables.schoolName = schoolName;
    }

    public static String getSchoolId() {
        return schoolId;
    }

    public static void setSchoolId(String schoolId) {
        myVariables.schoolId = schoolId;
    }

    public static String getRegion() {
        return region;
    }

    public static void setRegion(String region) {
        myVariables.region = region;
    }

    public static String getDivision() {
        return division;
    }

    public static void setDivision(String division) {
        myVariables.division = division;
    }

    public static String getDistrict() {
        return district;
    }

    public static void setDistrict(String district) {
        myVariables.district = district;
    }

    public static String getPrincipal() {
        return principal;
    }

    public static void setPrincipal(String principal) {
        myVariables.principal = principal;
    }
    
    
    public static String getIpAddress() {
        return ipAddress;
    }

    public static void setIpAddress(String ipAddress) {
        myVariables.ipAddress = ipAddress;
    }
    
    
    public static String getStudentsIcon() {
        return studentsIcon;
    }

    public static String getStudentsPrsnlInfIcon() {
        return studentsPrsnlInfIcon;
    }

    public static String getSubjectsIcon() {
        return subjectsIcon;
    }

    public static String getSubjeLoadsIcon() {
        return subjeLoadsIcon;
    }

    public static String getUsersIcon() {
        return usersIcon;
    }

    public static String getUsersPrsnlInfIcon() {
        return usersPrsnlInfIcon;
    }
    //</editor-fold>
}
