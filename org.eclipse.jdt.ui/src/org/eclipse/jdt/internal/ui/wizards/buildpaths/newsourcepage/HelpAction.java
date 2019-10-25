/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.jdt.internal.ui.wizards.buildpaths.newsourcepage;

import org.eclipse.jface.action.Action;

import org.eclipse.ui.PlatformUI;

import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.wizards.NewWizardMessages;

/**
 * Action to get help.
 */
public class HelpAction extends Action {

    public HelpAction() {
        super();
        setImageDescriptor(JavaPluginImages.DESC_OBJS_HELP);
        setText(NewWizardMessages.NewSourceContainerWorkbookPage_ToolBar_Help_label);
        setToolTipText(NewWizardMessages.NewSourceContainerWorkbookPage_ToolBar_Help_tooltip);
    }

    @Override
	public void run() {
        PlatformUI.getWorkbench().getHelpSystem().displayHelpResource(NewWizardMessages.NewSourceContainerWorkbookPage_ToolBar_Help_link);
    }
}
