package PhoneContact;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private String Tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public PhoneNumber(String name, String tel) {
        this.name = name;
        Tel = tel;
    }
}

