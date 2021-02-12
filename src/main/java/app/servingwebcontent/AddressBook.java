package app.servingwebcontent;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public int id;

    public List<BuddyInfo> infos = new ArrayList<>();

    public AddressBook() {

    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void addBuddy(BuddyInfo aa) {
        if (aa != null) {
            infos.add(aa);
        }
    }

    public int size(){
        return infos.size();
    }

    public void clear(){
        this.infos = null;
    }

    public String toString() {

        String addresses = "";

        for (Object buddy : this.infos) {

            addresses += buddy.toString() + "\n";

        }

        return addresses;

    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < infos.size()) {
            infos.remove(index);
        }
    }

    public BuddyInfo getBuddy(int i) {
        if (i >= 0 && i < infos.size()) {
            return infos.get(i);
        }
        return null;
    }

    public List<BuddyInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<BuddyInfo> str) {
        infos = str;
    }


    public static void main(String[] args){

    }

}