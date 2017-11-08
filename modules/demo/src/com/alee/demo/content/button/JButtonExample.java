/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.demo.content.button;

import com.alee.demo.api.example.*;
import com.alee.demo.api.example.wiki.OracleWikiPage;
import com.alee.demo.api.example.wiki.WikiPage;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.grouping.GroupPane;
import com.alee.managers.language.WebLanguageManager;
import com.alee.managers.style.StyleId;
import com.alee.utils.CollectionUtils;

import javax.swing.*;
import java.util.List;

/**
 * @author Mikle Garin
 */

public class JButtonExample extends AbstractStylePreviewExample
{
    @Override
    public String getId ()
    {
        return "jbutton";
    }

    @Override
    protected String getStyleFileName ()
    {
        return "button";
    }

    @Override
    public FeatureType getFeatureType ()
    {
        return FeatureType.swing;
    }

    @Override
    public WikiPage getWikiPage ()
    {
        return new OracleWikiPage ( "How to Use Buttons", "button" );
    }

    @Override
    protected List<Preview> createPreviews ()
    {
        final TextButton e1 = new TextButton ( StyleId.button );
        final TextButton e2 = new TextButton ( StyleId.buttonHover );
        final IconButton e3 = new IconButton ( StyleId.buttonIcon );
        final IconButton e4 = new IconButton ( StyleId.buttonIconHover );
        return CollectionUtils.<Preview>asList ( e1, e2, e3, e4 );
    }

    /**
     * Button preview.
     */
    protected class TextButton extends AbstractStylePreview
    {
        /**
         * Constructs new style preview.
         *
         * @param styleId preview style ID
         */
        public TextButton ( final StyleId styleId )
        {
            super ( JButtonExample.this, "text", FeatureState.updated, styleId );
        }

        @Override
        protected List<? extends JComponent> createPreviewElements ()
        {
            final JButton basic = new JButton ();
            basic.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );
            WebLanguageManager.registerComponent ( basic, getPreviewLanguagePrefix () + "basic" );

            final JButton group1 = new JButton ();
            group1.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );
            WebLanguageManager.registerComponent ( group1, getPreviewLanguagePrefix () + "group1" );

            final JButton group2 = new JButton ();
            group2.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );
            WebLanguageManager.registerComponent ( group2, getPreviewLanguagePrefix () + "group2" );

            final JButton group3 = new JButton ();
            group3.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );
            WebLanguageManager.registerComponent ( group3, getPreviewLanguagePrefix () + "group3" );

            final JButton icon = new JButton ( WebLookAndFeel.getIcon ( 16 ) );
            icon.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );
            WebLanguageManager.registerComponent ( icon, getPreviewLanguagePrefix () + "icon" );

            return CollectionUtils.asList ( basic, new GroupPane ( group1, group2, group3 ), icon );
        }
    }

    /**
     * Icon button preview.
     */
    protected class IconButton extends AbstractStylePreview
    {
        /**
         * Constructs new style preview.
         *
         * @param styleId preview style ID
         */
        public IconButton ( final StyleId styleId )
        {
            super ( JButtonExample.this, "icon", FeatureState.updated, styleId );
        }

        @Override
        protected List<? extends JComponent> createPreviewElements ()
        {
            final JButton basic = new JButton ( WebLookAndFeel.getIcon ( 16 ) );
            basic.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );

            final JButton group1 = new JButton ( WebLookAndFeel.getIcon ( 16 ) );
            group1.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );

            final JButton group2 = new JButton ( WebLookAndFeel.getIcon ( 16 ) );
            group2.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );

            final JButton group3 = new JButton ( WebLookAndFeel.getIcon ( 16 ) );
            group3.putClientProperty ( StyleId.STYLE_PROPERTY, getStyleId () );

            return CollectionUtils.asList ( basic, new GroupPane ( group1, group2, group3 ) );
        }
    }
}