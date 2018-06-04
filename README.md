This is demo project of how to include lib project on APP:

MainProject
  app(dependence on LibCommon sp_lib)

SlaveProject
  sp_app(dependence on LibCommon sp_lib)
  sp_lib

LibCommon

