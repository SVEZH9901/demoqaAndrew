package Steps;

import static Pages.AutomationPracticeForm.*;

public class StepsAutomationPracticeForm{

    public static void StepClickSumbit()
    {
        clickSumbit();
    }

    public static void stepClickGender(String gender){
        switch (gender){
            case "Man":
                setMaleGener();
                break;
            case "Woman":
                setFemaleGener();
                break;
            case "Other":
                setOtherGener();
                break;
            default:
                setMaleGener();
                break;
        }
    }

    public static void stepSetFirstName(String firstName){
        setFirstName(firstName);
    }

    public static void stepSetLastName(String lastName){
        setLastName(lastName);
    }

    public static void stepSetEmail(String email){
        setEmail(email);
    }

    public static void stepSetMobile(String mobile){
        setMobile(mobile);
    }

    public static void stepSetSubjects(String subject){
        setSubjects(subject);
    }

    public static void stepSetDateOfBirth(String date){
        String dd = date.substring(0,2);
        String mm = date.substring(3,5);
        String yy = date.substring(6);

        if(Integer.parseInt(yy) < 1900){
            yy = "1900";
        } else if (Integer.parseInt(yy) > 2100) {
            yy = "2100";
        }

        setDateOfBirth(mm, yy, dd);
    }

    public static void stepSetCurrentAdress(String currentAdress){
        setCurrentAddress(currentAdress);
    }

    public static void stepUploadPhoto(String pathToFile){
        setPicture(pathToFile);
    }

    public static void stepSetHobbiesCheckBoxSports(){
        setHobbiesCheckBoxSports();
    }

    public static void stepSetHobbiesCheckBoxReading(){
        setHobbiesCheckBoxReading();
    }

    public static void stepSetHobbiesCheckBoxMusic(){
        setHobbiesCheckBoxMusic();
    }

    public static void stepSetState(String state){
        setState(state);
    }
}
