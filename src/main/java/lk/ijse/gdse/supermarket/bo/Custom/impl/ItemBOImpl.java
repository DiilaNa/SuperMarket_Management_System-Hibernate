package lk.ijse.gdse.supermarket.bo.Custom.impl;

import lk.ijse.gdse.supermarket.bo.Custom.ItemBO;
import lk.ijse.gdse.supermarket.dao.Custom.ItemDAO;
import lk.ijse.gdse.supermarket.dao.DAOFactory;
import lk.ijse.gdse.supermarket.dto.ItemDTO;
import lk.ijse.gdse.supermarket.entity.Item;
import org.modelmapper.ModelMapper;


import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOType.ITEM);

    @Override
    public boolean saveItem(ItemDTO itemDTO) throws SQLException {
      Item item = new ModelMapper().map(itemDTO, Item.class);
      return itemDAO.save(item);
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws SQLException {
       Item item =new ModelMapper().map(itemDTO, Item.class);
       return itemDAO.update(item);

    }

    @Override
    public boolean deleteItem(String id) throws SQLException {
        return itemDAO.delete(id);
    }

    @Override
    public ArrayList<ItemDTO> getAllItemList() throws SQLException {
        ArrayList<ItemDTO> list = new ArrayList<>();
        ArrayList<Item>items = itemDAO.getALL();
        for (Item item : items) {
            list.add(new ItemDTO(item.getItemId(),item.getItemName(),item.getQuantity(),item.getPrice()));
        }
        return list;
    }

    @Override
    public ItemDTO searchItem(String id) throws SQLException, ClassNotFoundException {

        Item item= itemDAO.search(id);
        return(item!=null)?
                new ItemDTO(
               item.getItemId(),
               item.getItemName(),
               item.getQuantity(),
               item.getPrice()):null;
    }

    @Override
    public ArrayList<String> getAllItemIds() throws SQLException {
        return itemDAO.getAllItemIds();
    }

    @Override
    public String getNextItemId() throws SQLException {
        return itemDAO.generateNewId();
    }
}
