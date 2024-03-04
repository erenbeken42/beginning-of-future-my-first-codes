package educationWebsiteExample.business;

import java.util.ArrayList;
import java.util.List;

import educationWebsiteExample.dataAccess.CategoryDao;
import educationWebsiteExample.entities.Category;
import educationWebsiteExample.logging.Logger;

public class CategorySManager {
	private CategoryDao categoryDao;
	private List<String> allCategories = new ArrayList<>();
	private List<Logger> loggers;
	
	public CategorySManager(CategoryDao categoryDao,List<Logger> loggers) {
		this.categoryDao=categoryDao;
		this.loggers = loggers;
	}
	public void add(Category category ) throws Exception{
		 if(isCategoryAlreadyAdded(category)) throw new Exception("Category name cannot be reuse");
	        else {
	            allCategories.add(category.getName());
	            categoryDao.add(category);
	        }
		 System.out.println("Category Added : " + category.getName());
		 for (Logger allLogger:loggers) {
	            allLogger.log(category.getName());
	        }
	
	
	}

	
	
	
	private boolean isCategoryAlreadyAdded(Category category) {
        for (String existingCategory : allCategories) {
            if (existingCategory.equals(category.getName())) {
                return true;
            }
        }
        return false;
    }
	
	
}
