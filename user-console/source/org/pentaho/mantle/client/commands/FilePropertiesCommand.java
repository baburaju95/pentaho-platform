/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2008 Pentaho Corporation.  All rights reserved.
 */
package org.pentaho.mantle.client.commands;

import org.pentaho.gwt.widgets.client.filechooser.RepositoryFile;
import org.pentaho.mantle.client.solutionbrowser.fileproperties.FilePropertiesDialog.Tabs;

public class FilePropertiesCommand extends AbstractFilePropertiesCommand {

  public FilePropertiesCommand(){}

  public FilePropertiesCommand(RepositoryFile repositoryFile){
    this.setRepositoryFile(repositoryFile);
  }

  private String solutionPath = null;

  @Override
  public String getSolutionPath() {
    return solutionPath;
  }

  @Override
  public void setSolutionPath(String solutionPath) {
    this.solutionPath = solutionPath;
  }

  @Override
  protected Tabs getActiveTab() {
    return Tabs.GENERAL;
  }
}
