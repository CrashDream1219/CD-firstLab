package ohos.codelabs.distributedvideo.duiagent;

import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;
import ohos.codelabs.distributedvideo.ResourceTable;

import java.util.ArrayList;
/**
 * CommonProvider
 * @since 2022-8-22
 */
public class SecondProvider extends BaseItemProvider {

    private ArrayList<SecondItem> duiList;
    private AbilitySlice controllerPage;

    public SecondProvider(ArrayList<SecondItem> lst, AbilitySlice abs) {
        this.duiList = lst;
        this.controllerPage = abs;
    }

    @Override
    public int getCount() {
        return duiList.size();
    }

    @Override
    public Object getItem(int i) {
        if(duiList!=null && duiList.size()>0 && i<duiList.size()){
            return duiList.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Component getComponent(int i, Component component, ComponentContainer componentContainer) {
        DirectionalLayout dl = (DirectionalLayout) LayoutScatter.getInstance(controllerPage).
                parse(ResourceTable.Layout_dui_list,null,false);
        SecondItem itm = duiList.get(i);

        Text txt = (Text) dl.findComponentById(ResourceTable.Id_ui_text);
        txt.setText(itm.getItem());
        return dl;
    }
}
