package com.hyls.datavisual.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.ListModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hyls.datavisual.entity.ColumnInfo;
import com.hyls.datavisual.entity.DictInfo;
import com.hyls.datavisual.entity.ImageInfo;
import com.hyls.datavisual.entity.SysModule;
import com.hyls.datavisual.entity.TableInfo;
import com.hyls.datavisual.service.IColumnService;
import com.hyls.datavisual.service.IDictService;
import com.hyls.datavisual.service.IImageService;
import com.hyls.datavisual.service.IModuleService;
import com.hyls.datavisual.service.ITableService;

@Controller
public class NonRestModuleController {
	@Autowired
    IModuleService moduleService;
	@Autowired
	ITableService tableService;
	@Autowired
	IColumnService columnService;
	@Autowired
	IDictService dictService;
	@Autowired
	IImageService imageService;
	@RequestMapping("/hello")
    public String index(Map<String,Object> map) {
		map.put("hello","from TemplateController.helloHtml");  
	    return "/helloHtml";  
        //return "Hello World";
    }
	
    
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam(value="name") String name,@RequestParam(value="typ") String typ,Model model) {
		System.out.println("param : "+ name );
		name=name.toUpperCase();
		System.out.println("param : "+ name );
		 	if("all".equals(typ)) {
		 		List<SysModule> moduleResult = new ArrayList<>();
		        List<SysModule> moduleList = moduleService.findModulesByName(name);
		        List<SysModule> moduleList2= moduleService.findModulesByCode(name);
		        if(moduleList!=null) {
		        	moduleResult.addAll(moduleList);
		        }
		        if(moduleList2!=null) {
		        	moduleResult.addAll(moduleList2);
		        }
		        //如果查找输入为空，则返回其中一个list即可
		        if("".equals(name.trim())) {
		        	 model.addAttribute("modules", moduleList);
		        	 return "search";
		        }
		        List<TableInfo> tableResult = new ArrayList<>();
		        List<TableInfo> tableList= tableService.findTableByName(name);
		        List<TableInfo> tableList2= tableService.findTableByCode(name);
		        if(tableList!=null) {
		        	tableResult.addAll(tableList);
		        }
		        if(tableList2!=null) {
		        	tableResult.addAll(tableList2);
		        }
		        
		        List<ColumnInfo> colResult = new ArrayList<>();
		        List<ColumnInfo> columnList = columnService.findColumnsByName(name);
		        List<ColumnInfo> columnList2= columnService.findColumnsByCode(name);
		        if(columnList!=null) {
		        	colResult.addAll(columnList);
		        }
		        if(columnList2!=null) {
		        	colResult.addAll(columnList2);
		        }
		        
		        model.addAttribute("modules", moduleResult);
		        model.addAttribute("tables", tableResult);
		        model.addAttribute("columns",colResult);
		 	}else if("mod".equals(typ)) {
		 		 List<SysModule> moduleResult = new ArrayList<>();
		 		 List<SysModule> moduleList = moduleService.findModulesByName(name);
			     List<SysModule> moduleList2= moduleService.findModulesByCode(name);
			     if(moduleList!=null) {
			        	moduleResult.addAll(moduleList);
			        }
			        if(moduleList2!=null) {
			        	moduleResult.addAll(moduleList2);
			        }
			        if("".equals(name.trim())) {
			        	 model.addAttribute("modules", moduleList);
			        	 return "search";
			        }
		 		 model.addAttribute("modules", moduleResult);
		 	}else if("tab".equals(typ)) {
		 		List<TableInfo> tableResult = new ArrayList<>();
		 		List<TableInfo> tableList= tableService.findTableByName(name);
		        List<TableInfo> tableList2= tableService.findTableByCode(name);
		        if(tableList!=null) {
		        	tableResult.addAll(tableList);
		        }
		        if(tableList2!=null) {
		        	tableResult.addAll(tableList2);
		        }
		        
		 		model.addAttribute("tables", tableResult);
		 	}else if("col".equals(typ)) {
		 		List<ColumnInfo> colResult = new ArrayList<>();
		 		List<ColumnInfo> columnList = columnService.findColumnsByName(name);
		        List<ColumnInfo> columnList2= columnService.findColumnsByCode(name);
		        if(columnList!=null) {
		        	colResult.addAll(columnList);
		        }
		        if(columnList2!=null) {
		        	colResult.addAll(columnList2);
		        }
		 		model.addAttribute("columns",colResult);
		 	}else if("dict".equals(typ)) {
		 		List<DictInfo> dictResult = new ArrayList<>();
		 		List<DictInfo> dictList= dictService.findDictsByColcode(name);
		 		List<DictInfo> dictList2= dictService.findDictsByDictValue(name);
		 		if(dictList!=null) {
		 			dictResult.addAll(dictList);
		        }
		        if(dictList2!=null) {
		        	dictResult.addAll(dictList2);
		        }
		 		model.addAttribute("dicts",dictResult);
		 		model.addAttribute("colcode",name);
		 		return "dict/list";
		 	}else if("image".equals(typ)) {
		 		List<ImageInfo> imageResult = new ArrayList<>();
		 		List<ImageInfo> imageList = imageService.findImageInfoByCode(name);
		 		List<ImageInfo> imageList2 = imageService.findImageInfoByName(name);
		 		if(imageList!=null) {
		 			imageResult.addAll(imageList);
		        }
		        if(imageList2!=null) {
		        	imageResult.addAll(imageList2);
		        }
		 		model.addAttribute("images",imageResult);
		 		return "image";
		 	}
	        return "search";
	}
	@RequestMapping("/modlist")
	public String  listModule(Model model) {
	        List<SysModule> moduleList = moduleService.findModuleList();
	        model.addAttribute("modules", moduleList);
	        return "module/list";
	}
	 
	@RequestMapping(value="/tablist",method = RequestMethod.GET)
	public String listTableByModule(@RequestParam(value="id") String id,Model model) {
		List<TableInfo> tableList = tableService.findTableBySysId(id);
		SysModule module = moduleService.findModuleById(id);
		model.addAttribute("tables",tableList);
		model.addAttribute("module",module);
		return "table/list";
	} 
	
	@RequestMapping(value="/collist",method = RequestMethod.GET)
	public String listColsByTab(@RequestParam(value="id") String id,@RequestParam(value="module")String module,Model model) {
		List<ColumnInfo> columnList = columnService.findColumnByTabId(id);
		
		model.addAttribute("columns",columnList);
		model.addAttribute("module",module);
		model.addAttribute("table",tableService.findTableById(id));
		return "column/list";
	} 
	
	@RequestMapping(value="/dictlist",method = RequestMethod.GET)
	public String listDictsByColPk(@RequestParam(value="pk") String pk,Model model) {
		List<DictInfo> dictList = dictService.findDictsByColpk(pk);
 		model.addAttribute("dicts",dictList);
 		model.addAttribute("colcode",dictList.get(0).getColCode());
 		return "dict/list";
	} 
	
}
