package test;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by ayeshjayasekara1 on 6/15/18.
 */
public class SiteLayoutInherited extends AnotherFile{

    public SiteLayoutInherited(PageParameters parameters) {
        super(parameters);
        Lable1 = new Label("fileID","Inherited!" );
        this.remove("fileID");
        this.add(Lable1);


    }
}
