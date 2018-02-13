package jp.co.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.training.dao.UserDao;
import jp.co.training.entity.User;
import jp.co.training.model.UserForm;

/**
 * ハローコントローラー
 *
 * @author ecfs-dev
 *
 */
@Controller
@EnableAutoConfiguration
public class UsersController {

	/** 在庫情報用Dao */
	@Autowired
	private UserDao userDao;

	/**
	 * 一覧画面
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/", "/users" })
	public String index(Model model) {

		List<User> users = userDao.selectAll();

		model.addAttribute("users", users);
		return "home/index";
	}

	/**
	 * 登録画面の表示
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/users/new")
	public String newUser(Model model) {
		model.addAttribute("userForm", new UserForm());
		return "home/new";
	}

	/**
	 * ユーザーを登録する
	 *
	 * @param userForm
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String create(@ModelAttribute UserForm userForm, Model model) {
		// 登録処理
		User user = new User();

		user.setName(userForm.getName());
		user.setEmail(userForm.getEmail());
		user.setPassword(userForm.getPassword());
		user.setRemarks(userForm.getRemarks());

		userDao.insert(user);

		return "redirect:/users";
	}

	/**
	 * 詳細画面の表示
	 *
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public String show(Model model, @PathVariable Integer id) {
		User user = userDao.selectById(id);

		model.addAttribute("user", user);
		return "home/show";
	}

	/**
	 * 編集画面の表示
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/users/{id}/edit")
	public String edit(Model model, @PathVariable("id") int id) {
		User user = userDao.selectById(id);

		model.addAttribute("user", user);
		return "home/edit";
	}

	/**
	 * ユーザーを更新する
	 *
	 * @param userForm
	 * @param model
	 * @return
	 */
	@RequestMapping(path = "/users/{id}", method = RequestMethod.PUT)
	String update(Model model, @ModelAttribute UserForm userForm, @PathVariable("id") int id) {

		User user = new User();

		user.setId((int) userForm.getId());
		user.setName(userForm.getName());
		user.setEmail(userForm.getEmail());
		user.setPassword(userForm.getPassword());
		user.setRemarks(userForm.getRemarks());

		userDao.update(user);

		return "redirect:/users";
	}

	@RequestMapping(path = "/users/{id}", method = RequestMethod.DELETE)
	String destory(Model model, @PathVariable("id") int id) {
		User user = userDao.selectById(id);

		userDao.delete(user);
		return "redirect:/users";
	}
}