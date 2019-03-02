function createNumberToken():Object {
	
	var result:Object = new Object();
	var scienceNumber:Object = new Object();
	var mantissaIntegerPart:String = "0";
	var mantissaDecimalPart:String = "0";
	var exponentIntegerPart
	
	
	result[ "chain" ] = new Vector.<Object>();
	scienceNumber[ "mantissa" ] = new Vector.<Object>( 2 );
	scienceNumber[ "exponent" ] = new Vector.<Object>( 2 );
	scienceNumber[ "mantissa" ][ 0 ] = mantissaIntegerPart;
	scienceNumber[ "mantissa" ][ 1 ] = mantissaDecimalPart;
	scienceNumber[ "exponent" ]
	
	return result;
	
}
