package libro.cap02.fechas.velocityTest;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
public class dataTransfer
{
    public static void main( String[] args )
        throws Exception
    {
    	      	
      	/*  first, get and initialize an engine  */
        VelocityEngine ve = new VelocityEngine();
        ve.init();
       
        /*  next, get the Template  */
        Template t = ve.getTemplate( "index.vm" );
        /*  create a context and add data */
        VelocityContext context = new VelocityContext();
        context.put("name", "World");
        
        /* now render the template into a StringWriter */
        StringWriter writer = new StringWriter();
        t.merge( context, writer );
        /* show the World */
        System.out.println( writer.toString() );     
    }
}