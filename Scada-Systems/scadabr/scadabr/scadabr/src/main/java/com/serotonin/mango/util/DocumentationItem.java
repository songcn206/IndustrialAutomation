/*
 Mango - Open Source M2M - http://mango.serotoninsoftware.com
 Copyright (C) 2006-2011 Serotonin Software Technologies Inc.
 @author Matthew Lohbihler
    
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.serotonin.mango.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthew Lohbihler
 */
@Deprecated //APL handle this in the html files directly
public class DocumentationItem {

    private final String id;
    private final List<String> related = new ArrayList<String>();

    public DocumentationItem(String id) {
        this.id = id;
    }

    public void addRelated(String id) {
        related.add(id);
    }

    public String getId() {
        return id;
    }

    public List<String> getRelated() {
        return related;
    }
}
