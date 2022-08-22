package ohos.codelabs.distributedvideo.duiagent;


import ohos.agp.components.element.ShapeElement;
import ohos.agp.colors.RgbColor;
import ohos.codelabs.distributedvideo.ResourceTable;

/**
 * This is a selector of a single page
 * For different pages, implement Selector to create your own selector logic to realize your unique UI layout
 * @since 2022-8-22
 *
 */

public class ColorBlindSelector implements Selector {
    private ShapeElement shape_button;


    public ColorBlindSelector() {
        this.shape_button = null;

    }

    public void change_col(){  // motive method of changing xml layout
        ShapeElement buttonPara = new ShapeElement();
        buttonPara.setRgbColor(new RgbColor(255, 0, 255));
        buttonPara.setShape(ShapeElement.OVAL);
        this.shape_button = buttonPara;

    }

    public ShapeElement get_shape(){
        return this.shape_button;
    }

    public void change_pre(DuiAgent x){
        if(x.Select().equals("正常模式")){
            x.setter_id(ResourceTable.Layout_remote_controller);
        }else{
            x.setter_id(ResourceTable.Layout_remote_controller_two);
        }
    }


    @Override
    public void initShow(DuiAgent x) {
        //change_pre(x);  //方法一
        change_col();


    }
}
