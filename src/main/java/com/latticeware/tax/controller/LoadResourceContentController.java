package com.latticeware.tax.controller;


import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuItem;
import org.primefaces.model.menu.MenuModel;



/**
 *
 * @author sfisque
 */
@Named
@RequestScoped
public class LoadResourceContentController
{
    private static final Logger LOG = Logger.getLogger( LoadResourceContentController.class.getName() );

    
    private MenuModel contentProviderModel;
    
    
    @PostConstruct
    public void init()
    {
        LOG.log( Level.INFO, "\ninitializing:: LoadResourceContentController\n" );
        
        contentProviderModel = new DefaultMenuModel();
        
        MenuItem sabrix = DefaultMenuItem.builder().title( "Sabrix" ).build();
        MenuItem vertex = DefaultMenuItem.builder().title( "Vertex" ).build();
        MenuItem other = DefaultMenuItem.builder().title( "Other" ).build();

        contentProviderModel.getElements().add( sabrix );
        contentProviderModel.getElements().add( vertex );
        contentProviderModel.getElements().add( other );
    }


    public MenuModel getContentProviderModel()
    {
        return contentProviderModel;
    }


    public void setContentProviderModel( MenuModel _contentProviderModel )
    {
        this.contentProviderModel = _contentProviderModel;
    }

    
}
