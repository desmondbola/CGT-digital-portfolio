package Snacks.diary;

public class Diary {
    private boolean isLocked = true;

    private String password;

    public Diary(String ownersName, String password){
        this.password = password;

    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unLocked(String correctPassword) {
        if(correctPassword.equals(password)){
            isLocked = false;
        }
    }

    public void locked() {
        isLocked = true;
    }

    public void write(String my_break_up_with_simi) {

    }
}



