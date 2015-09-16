//-------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.StringTokenizer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

//-------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Engineered and developed by Jhonny Trejos Barrios.
 * Technology: Java.
 * Version: Java Development Kit 1.8.0_31, Standard Edition.
 * Development Environment: Sublime Text 3.
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * Additional Info.
 *
 * Source Code Target:
 *
 *			Africa 2010, Qualification Round: Reverse Words.
 *
 * Licenses: Personal, not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Console
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		new Console().reverse();
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void reverse()
	{
		try
		{
			File solution = new File( "filePath/Output.txt" );
			File original = new File( "filePath/B-large-practice.in.txt" );
			FileReader FR = new FileReader( original );
			BufferedReader BR = new BufferedReader( FR );
			FileWriter FW = new FileWriter( solution );

			int cases = Integer.parseInt( BR.readLine() );

			for( int pointer = 0; pointer < cases; pointer++ )
			{
				
				StringTokenizer ST = new StringTokenizer( BR.readLine() , " " );
				String[] tokens = new String[ ST.countTokens() ];

				for( int i = 0; i < tokens.length; i++ )
				{
					tokens[ tokens.length - i - 1 ] = ST.nextToken();
				}

				System.out.print( "Case #" + ( pointer + 1 ) + ": " );
				FW.write( "Case #" + ( pointer + 1 ) + ": " );

				for( int i = 0; i < tokens.length; i++ )
				{
					if( i == tokens.length - 1 )
					{
						System.out.print( tokens[ i ] );
						FW.write( tokens[ i ] );
					}
					else
					{
						System.out.print( tokens[ i ] + " " );
						FW.write( tokens[ i ] + " " );
					}
				}

				System.out.println( "" );
				FW.write( "\n" );
			}

			BR.close();
			FR.close();
			FW.close();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------
