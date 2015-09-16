//-------------------------------------------------------------------------------------------------------------------------------------------------
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
 *			Google Code Jam.   Exercise: Qualification Africa 2010, C. T9 Spelling.
 *
 * Licenses: Personal, not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Output
{
	FileReader FR;
	FileWriter FW;
	BufferedReader BR;
	int key, reps;
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		new Output().keyPress();
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void keyPress()
	{
		try
		{
			FR = new FileReader( "filePath/c-large-practice.in.txt" );
			FW = new FileWriter( "filePath/Output.txt" );
			BR = new BufferedReader( FR );
			int cases = Integer.parseInt( BR.readLine() );

			for( int j = 0; j < cases; j++ )
			{
				char[] array = BR.readLine().toCharArray();
				System.out.print( "Case #" + ( j + 1 ) + ": " );
				FW.write( "Case #" + ( j + 1 ) + ": " );
				
				for( int i = 0; i < array.length ; i++ )
				{
					if( "abc".contains( array[ i ] + "" ) )
					{
						key = 2;
						reps = getReps( "abc", array[ i ] + "" );
						FW.write( printReps() );

						if( i != array.length-1 )
						{
							FW.write( seeNext( "abc", array[ i + 1 ] + "" ) );
						}
					}
					else
					{
						if( "def".contains( array[ i ] + "" ) )
						{
							key = 3;
							reps = getReps( "def", array[ i ] + "" );
							FW.write( printReps() );

							if( i != array.length-1 )
							{
								FW.write( seeNext( "def", array[ i + 1 ] + "" ) );
							}
						}
						else
						{
							if( "ghi".contains( array[ i ] + "" ) )
							{
								key = 4;
								reps = getReps( "ghi", array[ i ] + "" );
								FW.write( printReps() );
				
								if( i != array.length-1 )
								{
									FW.write( seeNext( "ghi", array[ i + 1 ] + "" ) );
								}
							}
							else
							{
								if( "jkl".contains( array[ i ] + "" ) )
								{
									key = 5;
									reps = getReps( "jkl", array[ i ] + "" );
									FW.write( printReps() );
									
									if( i != array.length-1 )
									{
										FW.write( seeNext( "jkl", array[ i + 1 ] + "" ) );
									}
								}
								else
								{
									if( "mno".contains( array[ i ] + "" ) )
									{
										key = 6;
										reps = getReps( "mno", array[ i ] + "" );
										FW.write( printReps() );
										
										if( i != array.length-1 )
										{
											FW.write( seeNext( "mno", array[ i + 1 ] + "" ) );
										}
									}
									else
									{
										if( "pqrs".contains( array[ i ] + "" ) )
										{
											key = 7;
											reps = getReps( "pqrs", array[ i ] + "" );
											FW.write( printReps() );
											
											if( i != array.length-1 )
											{
												FW.write( seeNext( "pqrs", array[ i + 1 ] + "" ) );
											}
										}
										else
										{
											if( "tuv".contains( array[ i ] + "" ) )
											{
												key = 8;
												reps = getReps( "tuv", array[ i ] + "" );
												FW.write( printReps() );
												
												if( i != array.length-1 )
												{
													FW.write( seeNext( "tuv", array[ i + 1 ] + "" ) );
												}
											}
											else
											{
												if( "wxyz".contains( array[ i ] + "" ) )
												{
													key = 9;
													reps = getReps( "wxyz", array[ i ] + "" );
													FW.write( printReps() );
													
													if( i != array.length-1 )
													{
														FW.write( seeNext( "wxyz", array[ i + 1 ] + "" ) );
													}
												}
												else
												{
													key = 0;
													reps = 1;
													FW.write( printReps() );
													
													if( i != array.length-1 )
													{
														FW.write( seeNext( " ", array[ i + 1 ] + "" ) );
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}

				System.out.println( "\n" );
				FW.write( "\n" );
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
	
	public int getReps( String strings, String letter )
	{
		int pos = 1;
		char[] extract = strings.toCharArray();

		for( int i = 0; i < extract.length; i++ )
		{
			if( letter.equals( extract[ i ] + "" ) )
			{
				pos = i + 1;
				break;
			}
		}

		return pos;
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public String printReps()
	{
		String output = "";

		for( int j = 0; j < reps; j++ )
		{
			System.out.print( key );
			output += key;
		}

		return output;
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public String seeNext( String strings, String letter )
	{
		String output = "";

		if( strings.contains( letter ) )
		{
			System.out.print( " " );
			output = " ";
		}

		return output;
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------
