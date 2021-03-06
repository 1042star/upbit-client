/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
#include "SwaggerTrade.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Templates/SharedPointer.h"

namespace Swagger 
{

void SwaggerTrade::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Market.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("market")); WriteJsonValue(Writer, Market.GetValue());	
	}
	if (Uuid.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("uuid")); WriteJsonValue(Writer, Uuid.GetValue());	
	}
	if (Price.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("price")); WriteJsonValue(Writer, Price.GetValue());	
	}
	if (Volume.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("volume")); WriteJsonValue(Writer, Volume.GetValue());	
	}
	if (Funds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("funds")); WriteJsonValue(Writer, Funds.GetValue());	
	}
	if (Side.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("side")); WriteJsonValue(Writer, Side.GetValue());	
	}
	if (CreatedAt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_at")); WriteJsonValue(Writer, CreatedAt.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool SwaggerTrade::FromJson(const TSharedPtr<FJsonObject>& JsonObject)
{
	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("market"), Market);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("uuid"), Uuid);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("price"), Price);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("volume"), Volume);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("funds"), Funds);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("side"), Side);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("created_at"), CreatedAt);

	return ParseSuccess;
}
}
