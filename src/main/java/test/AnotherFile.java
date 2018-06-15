package test;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by ayeshjayasekara1 on 6/14/18.
 */
public class AnotherFile  extends WebPage {
    public AnotherFile(final PageParameters parameters) {
        add(new Label("fileID", "Testing a new tag!"));
    }
}
