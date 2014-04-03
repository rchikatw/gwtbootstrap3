package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
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

import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap3.client.ui.base.mixin.PullMixin;
import org.gwtbootstrap3.client.ui.constants.Pull;
import org.gwtbootstrap3.client.ui.constants.Styles;
import org.gwtbootstrap3.client.ui.constants.Toggle;

/**
 * Special button to toggle collapsible area of {@link Navbar}.
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 * @see NavbarCollapse
 */
public class NavbarCollapseButton extends Composite implements HasTarget, HasResponsiveness, HasPull {

    private final PullMixin<NavbarCollapseButton> pullMixin = new PullMixin<NavbarCollapseButton>(this);
    private final Button button;

    public NavbarCollapseButton() {
        button = new Button();
        button.setStyleName(Styles.NAVBAR_TOGGLE);
        button.setToggle(Toggle.COLLAPSE);

        button.add(newBarIcon());
        button.add(newBarIcon());
        button.add(newBarIcon());

        initWidget(button);
    }

    @Override
    public void setTarget(final String target) {
        button.setTarget(target);
    }

    @Override
    public String getTarget() {
        return button.getTarget();
    }

    @Override
    public void setVisibleOn(final String deviceSizeString) {
        StyleHelper.setVisibleOn(this, deviceSizeString);
    }

    @Override
    public void setHiddenOn(final String deviceSizeString) {
        StyleHelper.setHiddenOn(this, deviceSizeString);
    }

    @Override
    public void setPull(final Pull pull) {
        pullMixin.setPull(pull);
    }

    @Override
    public Pull getPull() {
        return pullMixin.getPull();
    }

    private Span newBarIcon() {
        final Span span = new Span();
        span.setStyleName(Styles.ICON_BAR);
        return span;
    }
}
