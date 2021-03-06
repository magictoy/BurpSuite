/*
 * Copyright (C) 2013 DobinRutishauser@broken.ch
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package gui.viewMessage;

import java.util.LinkedList;
import javax.swing.BoundedRangeModel;

/**
 *
 * @author unreal
 */
public class ViewMessageLinkManager {

    private LinkedList<PanelViewMessageUi> messageUiList = new LinkedList<PanelViewMessageUi>();
    
    public void registerViewMessage(PanelViewMessageUi viewMessageUi) {
        messageUiList.add(viewMessageUi);
    }
    
    public void setPosition(int n, PanelViewMessageUi orig) {
        for (PanelViewMessageUi messageUi: messageUiList) {
            if (messageUi != orig) {
                messageUi.setPosition(n);
            }
        }
    }

    public void setScrollModel(BoundedRangeModel model, PanelViewMessageUi orig) {
       for (PanelViewMessageUi messageUi: messageUiList) {
            if (messageUi != orig) {
                messageUi.setScrollBarModel(model);
            }
        }
    }
    
}
