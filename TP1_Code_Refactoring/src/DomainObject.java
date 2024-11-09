
public class DomainObject {
	public DomainObject (String name) {
		_name = name;
	};
	public DomainObject () {};
	public String name () {
		return _name;
	};
	protected String _name = "no name";
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}

}
