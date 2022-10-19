package PhoneContact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class PhoneBook extends Phone {

    ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        if (PhoneList.isEmpty()) {
            PhoneList.add(name + ", " + phone);
        } else {
            String pb = searchPhone(name);
            if (pb != null) {
                if (!pb.contains(phone)) {
                    PhoneList.set(PhoneList.indexOf(pb), pb + " : " + phone);
                }
            } else {
                PhoneList.add(name + ", " + phone);
            }
//            boolean found = false;
//            for(String pb: PhoneList){
//                if (pb.split(",")[0].equals(name)){
//                    found = true;
//                    if (!pb.contains(phone)){
//                        PhoneList.set(PhoneList.indexOf(pb),pb + " : " + phone);
//                    }
//                    break;
//                }
//            }
//            if (!found){
//                PhoneList.add(name + ", " + phone);
//            }
        }
    }

    @Override
    public void removePhone(String name) {
        if (PhoneList.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            String pb = searchPhone(name);
            if (pb != null) {
                PhoneList.remove(pb);
                System.out.println("Remove user " + name + " from phone list successful");
            } else {
                System.out.println("Can not find the user " + name + " in phone list");
            }
//            boolean found = false;
//            for (String pb: PhoneList){
//                if (pb.split(",")[0].equals(name)){
//                    found = true;
//                    PhoneList.remove(pb);
//                    System.out.println("Remove user " + name + " from phone list successful");
//                    break;
//                }
//            }
//            if (!found){
//                System.out.println("Can not find the user " + name + " in phone list");
//            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        if (PhoneList.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            String pb = searchPhone(name);
            if (pb != null) {
                if (!pb.contains(newPhone)) {
                    PhoneList.set(PhoneList.indexOf(pb), pb.split(",")[0] + ", " + newPhone);
                }
            } else {
                System.out.println("Can not find the user " + name + "for update in phone list");
            }
        }
    }

    @Override
    public String searchPhone(String name) {
        for (String pb : PhoneList) {
            if (pb.split(",")[0].equals(name)) {
                return pb;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        if (PhoneList.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            //Sap xep tang dan

        }
    }
}


