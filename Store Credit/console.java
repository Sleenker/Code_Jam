//-------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

import java.util.StringTokenizer;

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
 *			
 *
 * Licence: Personal, not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Console
{
	FileReader FR;
	FileWriter FW;
	BufferedReader BR;
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		new Console().calculateCredits();
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void calculateCredits()
	{
		try
		{
			FR = new FileReader( "filePath/a-large-practice.in.txt" );
			BR = new BufferedReader( FR );
			FW = new FileWriter( "filePath/Output.txt" );
			int cases = Integer.parseInt( BR.readLine() );

			for( int c = 0; c < cases; c++ )
			{

				int item1 = 1, item2 = 1, credits = Integer.parseInt( BR.readLine() );

				int[] prices = new int[ Integer.parseInt( BR.readLine() ) ];

				StringTokenizer tokens = new StringTokenizer( BR.readLine(), " " );

				for( int i = 0; i < prices.length; i++ )
				{
					prices[ i ] = Integer.parseInt( tokens.nextToken() );
				}

				for( int i = 0; i < prices.length - 1; i++ )
				{
					for( int j = i + 1; j < prices.length; j++ )
					{
						if( prices[ i ] + prices[ j ] == credits )
						{
							item1 = ( i + 1 );
							item2 = ( j + 1 );
							break;
						}
					}
				}

				System.out.println( "Case #" + ( c + 1 ) + ": " + item1 + " " + item2 );
				FW.write( "Case #" + ( c + 1 ) + ": " + item1 + " " + item2 + "\n" );
			}

			FW.close();
			FR.close();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------
