/**
 * Fax.to REST API client for Scala
 * This is Fax.to REST API client for Scala.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: inquiries@fax.to
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class InlineResponse20017 (
  // The status of the API request
  status: Option[String] = None,
  // Numbers data
  numbers: Option[List[InlineResponse20017Numbers]] = None,
  meta: Option[InlineResponse2004Meta] = None
)

