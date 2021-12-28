package io.swagger.codegen;

import io.swagger.models.Model;

public interface ResponseModel extends Model {
  Boolean getIsResponseData();

  void setIsResponseData(Boolean title);
}
