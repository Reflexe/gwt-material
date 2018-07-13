/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.TextResource;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.swing.text.html.StyleSheet;

public interface MaterialResources extends ClientBundle {
    MaterialResources INSTANCE = GWT.create(MaterialResources.class);

    @Source("fonts/roboto/Roboto-Bold.woff")
    DataResource robotoBoldWoff();
    @Source("fonts/roboto/Roboto-Bold.ttf")
    DataResource robotoBoldTtf();
    @Source("fonts/roboto/Roboto-Bold.woff2")
    DataResource robotoBoldWoff2();

    @Source("fonts/roboto/Roboto-Light.woff")
    DataResource robotoLightWoff();
    @Source("fonts/roboto/Roboto-Light.ttf")
    DataResource robotoLightTtf();
    @Source("fonts/roboto/Roboto-Light.woff2")
    DataResource robotoLightWoff2();

    @Source("fonts/roboto/Roboto-Medium.woff")
    DataResource robotoMediumWoff();
    @Source("fonts/roboto/Roboto-Medium.ttf")
    DataResource robotoMediumTtf();
    @Source("fonts/roboto/Roboto-Medium.woff2")
    DataResource robotoMediumWoff2();

    @Source("fonts/roboto/Roboto-Regular.woff")
    DataResource robotoRegularWoff();
    @Source("fonts/roboto/Roboto-Regular.ttf")
    DataResource robotoRegularTtf();
    @Source("fonts/roboto/Roboto-Regular.woff2")
    DataResource robotoRegularWoff2();

    @Source("fonts/roboto/Roboto-Thin.woff")
    DataResource robotoThinWoff();
    @Source("fonts/roboto/Roboto-Thin.ttf")
    DataResource robotoThinTtf();
    @Source("fonts/roboto/Roboto-Thin.woff2")
    DataResource robotoThinWoff2();

    @Source("fonts/material-icons/MaterialIcons-Regular.woff")
    DataResource materialIconsWoff();
    @Source("fonts/material-icons/MaterialIcons-Regular.ttf")
    DataResource materialIconsTtf();
    @Source("fonts/material-icons/MaterialIcons-Regular.eot")
    DataResource materialIconsEot();
    @Source("fonts/material-icons/MaterialIcons-Regular.woff2")
    DataResource materialIconsWoff2();
    @Source("fonts/material-icons/MaterialIcons-Regular.ijmap")
    DataResource materialIconsIjmap();

    @Source("js/animation.js")
    TextResource animationJs();

    @Source("js/materialize.js")
    TextResource materializeJs();

    @Source("css/materialize.gss")
    @CssResource.NotStrict
    CssResource materialize();

    @Source("css/overridecss.gss")
    @CssResource.NotStrict
    CssResource overridecss();

    @Source("css/animation.gss")
    @CssResource.NotStrict
    CssResource animation();

    interface FontsResource extends CssResource {

    }

    @Source("css/fonts.gss")
    @CssResource.NotStrict
    FontsResource fonts();
}
