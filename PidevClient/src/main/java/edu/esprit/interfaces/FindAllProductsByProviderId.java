package edu.esprit.interfaces;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

import edu.esprit.delegate.DelegateProduct;
import edu.esprit.pidev.Product;

public class FindAllProductsByProviderId extends JFrame {

	private JPanel contentPane;
	private JTable table;
	List<Product> products;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindAllProductsByProviderId frame = new FindAllProductsByProviderId(1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FindAllProductsByProviderId() {
		System.out.println("default");
		getContentPane().setLayout(null);
		table_1 = new JTable();
		table_1.setBounds(48, 80, 339, 131);
		getContentPane().add(table_1);
	}

	public FindAllProductsByProviderId(Integer providerId) {
		System.out.println("ahla");
		DelegateProduct delegateProduct = new DelegateProduct();

		products = new ArrayList<Product>();
		products = delegateProduct.findAllProductsByProviderId(providerId);
		System.out.println("les produit "+products.size());
		// Integer.parseInt(table.getModel().getValueAt(selectedRow,
		// 6).toString())

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setBounds(35, 25, 369, 173);
		contentPane.add(table);
		initDataBindings();
	}

	protected void initDataBindings() {
		JTableBinding<Product, List<Product>, JTable> jTableBinding = SwingBindings
				.createJTableBinding(UpdateStrategy.READ, products, table_1);
		//
		BeanProperty<Product, Integer> productBeanProperty = BeanProperty
				.create("idProduct");
		jTableBinding.addColumnBinding(productBeanProperty).setColumnName(
				"New Column");
		//
		BeanProperty<Product, String> productBeanProperty_1 = BeanProperty
				.create("nom");
		jTableBinding.addColumnBinding(productBeanProperty_1).setColumnName(
				"New Column");
		//
		BeanProperty<Product, String> productBeanProperty_2 = BeanProperty
				.create("paymentWay");
		jTableBinding.addColumnBinding(productBeanProperty_2).setColumnName(
				"New Column");
		//
		BeanProperty<Product, Float> productBeanProperty_3 = BeanProperty
				.create("price");
		jTableBinding.addColumnBinding(productBeanProperty_3).setColumnName(
				"New Column");
		//
		BeanProperty<Product, Integer> productBeanProperty_4 = BeanProperty
				.create("quantity");
		jTableBinding.addColumnBinding(productBeanProperty_4).setColumnName(
				"New Column");
		//
		BeanProperty<Product, String> productBeanProperty_5 = BeanProperty
				.create("state");
		jTableBinding.addColumnBinding(productBeanProperty_5).setColumnName(
				"New Column");
		//
		BeanProperty<Product, Integer> productBeanProperty_6 = BeanProperty
				.create("provider.id");
		jTableBinding.addColumnBinding(productBeanProperty_6).setColumnName(
				"New Column");
		//
		jTableBinding.bind();
	}
}
