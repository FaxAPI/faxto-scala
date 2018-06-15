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


case class InlineResponse2004Inbox (
  id: Option[Integer] = None,
  didId: Option[Integer] = None,
  filename: Option[String] = None,
  filesize: Option[String] = None,
  number: Option[String] = None,
  sender: Option[String] = None,
  totalPages: Option[Integer] = None,
  createdAt: Option[InlineResponse2003Created] = None,
  previewFile: Option[String] = None,
  fileUrl: Option[String] = None
)

