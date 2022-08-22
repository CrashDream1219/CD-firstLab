package ohos.codelabs.distributedvideo.duiagent;


/**
 * This is the data structure used for information storage
 * @since 2022-8-22
 *
 */

public class DuiComponent {
    private int id;
    private String device_id;
    private String Abtype;
    private int stu;

    public DuiComponent(int id, String device_id, String abtype, int stu) {
        this.id = id;
        this.device_id = device_id;
        Abtype = abtype;
        this.stu = stu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getAbtype() {
        return Abtype;
    }

    public void setAbtype(String abtype) {
        Abtype = abtype;
    }

    public int getStu() {
        return stu;
    }

    public void setStu(int stu) {
        this.stu = stu;
    }

}
