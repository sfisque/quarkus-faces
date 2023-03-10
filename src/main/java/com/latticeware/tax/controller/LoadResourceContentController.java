package com.latticeware.tax.controller;


import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author sfisque
 */
@Named
@SessionScoped
public class LoadResourceContentController
{
    private static final Logger LOG = Logger.getLogger( LoadResourceContentController.class.getName() );

    
    private List<String> contentProviderModel;
    private String contentProvider;
    
    
    @PostConstruct
    public void init()
    {
        LOG.log( Level.INFO, "\ninitializing:: LoadResourceContentController\n" );
        
        contentProviderModel = new ArrayList<>();
        
        
        contentProviderModel.add( "Sabrix" );
        contentProviderModel.add( "Vertex" );
        contentProviderModel.add( "Other" );
    }


    public List<String> getContentProviderModel()
    {
        return contentProviderModel;
    }


    public void setContentProviderModel( List<String> _contentProviderModel )
    {
        this.contentProviderModel = _contentProviderModel;
    }


    public String getContentProvider()
    {
        return contentProvider;
    }


    public void setContentProvider( String _contentProvider )
    {
        this.contentProvider = _contentProvider;
    }

    
}
