package ohos.codelabs.distributedvideo.duiagent;

import ohos.codelabs.distributedvideo.ResourceTable;
import java.util.ArrayList;

/**
 * This is a agent for DUI data transmission
 * Import the ResourceTable of the app to successfully create a distributable subset of UI Component
 * Each agent can be assign to one AbilitySlice, and manage multiple internal pages with distribution setup
 * Use this class to extract your data, or connect to your external algo.
 * @since 2022-8-22
 *
 */

public class DuiAgent {  //命名

    //General variable
    private ArrayList<DuiComponent> DistributableResourceTable;
    private ArrayList<String> local_preset;

    /* Motive variables: Add your own selector & corresponding variables if more than one page is
     * programmed under a single AbilitySlice.
     */

    private String Chosen;
    private ColorBlindSelector player_selector;
    private int pre_id;
    public boolean NeedChange = false;

    public DuiAgent(String preset) {
        this.DistributableResourceTable = new ArrayList<DuiComponent>();
        this.local_preset = new ArrayList<String>();
        this.Chosen = preset;
        this.player_selector = new ColorBlindSelector();
        setter_id(ResourceTable.Layout_remote_controller);
    }

    public DuiAgent() {
        this.DistributableResourceTable = new ArrayList<DuiComponent>();
        this.local_preset = new ArrayList<String>();
        this.Chosen = PresetTable.Player_Default;
        this.player_selector = new ColorBlindSelector();
        this.pre_id = 0;
    }

    public String Select(){  // This gives you the chosen set of DUI plan
        return Chosen;
    }

    public ColorBlindSelector seletor(){ // This gives you the chosen selector
        return player_selector;
    }

    public void toggle_player_selector(){
        NeedChange = !NeedChange;
    }

    public void upload_set(){   //dull method, not used when initiate real programming
        add_preset(PresetTable.Player_Default);
        add_preset(PresetTable.Player_Set_Two);
    }

    public void setter_id(int x){
        this.pre_id = x;
    }

    public ArrayList<String> getter1(){  // This gives you the preset list
        return local_preset;
    }

    public int getter_id(){ return pre_id;}

    public void register(String x){
        this.Chosen = x;
    }

    public void update(int id, String device_id, String Abtype, int stu){   // UI component update
        String id1 = Integer.toString(id);
        String stu1 = Integer.toString(stu);

    }

    public ArrayList<DuiComponent> indicate(){return DistributableResourceTable;}

    public void add_preset(String preset_name){
        local_preset.add(preset_name);
    }

    public void dele_preset(String preset_name){
        local_preset.remove(preset_name);
    }


    public DuiComponent get(int x){
        DuiComponent temp = DistributableResourceTable.get(x);
        return temp;
    }

    public void provoke(int x){
        // A upload method to external database of trigger information
    }

    public void maintain(int x){
        // A upload method to external database of local lists
    }



    public void player_select(){  // This will call on your own deciding logic to initiate Distribution
        toggle_player_selector();
        player_selector.initShow(this);
    }


}
